using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter
{
    public class Parser
    {
        private readonly Lexer lexer;
        private Token currentToken;

        public Parser(Lexer lexer)
        {
            this.lexer = lexer;
            currentToken = lexer.GetNextToken();
        }

        private void Eat(Token.Type tokenType)
        {
            if (currentToken.TokenType == tokenType)
            {
                currentToken = lexer.GetNextToken();
            }
            else
            {
                throw new ArgumentException("Invalid syntax");
            }
        }

        private AST Factor()
        {
            Token token = currentToken;
            switch (token.TokenType)
            {
                case Token.Type.Integer:
                    Eat(Token.Type.Integer);
                    return new Num(token);
                case Token.Type.LParen:
                    Eat(Token.Type.LParen);
                    AST node = Expr();
                    Eat(Token.Type.RParen);
                    return node;

                default:
                    throw new ArgumentException("Invalid syntax");
            }
        }

        private AST Term()
        {
            AST node = Factor();

            while (currentToken.TokenType == Token.Type.Multiply || currentToken.TokenType == Token.Type.Divide)
            {
                Token token = currentToken;
                if (token.TokenType == Token.Type.Multiply)
                {
                    Eat(Token.Type.Multiply);
                }
                else if (token.TokenType == Token.Type.Divide)
                {
                    Eat(Token.Type.Divide);
                }
                node = new BinOp(node, token, Factor());
            }

            return node;
        }

        public AST Expr()
        {
            AST node = Term();

            while (currentToken.TokenType == Token.Type.Plus || currentToken.TokenType == Token.Type.Minus)
            {
                Token token = currentToken;
                if (token.TokenType == Token.Type.Plus)
                {
                    Eat(Token.Type.Plus);
                }
                else if (token.TokenType == Token.Type.Minus)
                {
                    Eat(Token.Type.Minus);
                }
                node = new BinOp(node, token, Term());
            }

            return node;
        }
    }
}
