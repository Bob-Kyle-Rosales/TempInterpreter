using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter
{
    public class Lexer
    {
        private readonly string text;
        private int pos;

        public Lexer(string text)
        {
            this.text = text;
            pos = 0;
        }

        private char CurrentChar()
        {
            return pos < text.Length ? text[pos] : '\0';
        }

        private void Advance()
        {
            pos++;
        }

        private void SkipWhitespace()
        {
            while (char.IsWhiteSpace(CurrentChar()))
            {
                Advance();
            }
        }

        private int Integer()
        {
            string result = "";

            while (char.IsDigit(CurrentChar()))
            {
                result += CurrentChar();
                Advance();
            }

            return int.Parse(result);
        }

        public Token GetNextToken()
        {
            while (pos < text.Length)
            {
                if (char.IsWhiteSpace(CurrentChar()))
                {
                    SkipWhitespace();
                    continue;
                }

                if (char.IsDigit(CurrentChar()))
                {
                    return new Token(Token.Type.Integer, Integer().ToString());
                }

                switch (CurrentChar())
                {
                    case '+':
                        Advance();
                        return new Token(Token.Type.Plus, "+");
                    case '-':
                        Advance();
                        return new Token(Token.Type.Minus, "-");
                    case '*':
                        Advance();
                        return new Token(Token.Type.Multiply, "*");
                    case '/':
                        Advance();
                        return new Token(Token.Type.Divide, "/");
                    case '(':
                        Advance();
                        return new Token(Token.Type.LParen, "(");
                    case ')':
                        Advance();
                        return new Token(Token.Type.RParen, ")");
                    case 'B': // added keyword
                        if (text.Substring(pos, 5) == "BEGIN")
                        {
                            pos += 5;
                            return new Token(Token.Type.Begin, "BEGIN");
                        }
                        break;
                    case 'E': // added keyword
                        if (text.Substring(pos, 3) == "END")
                        {
                            pos += 3;
                            return new Token(Token.Type.End, "END");
                        }
                        break;
                }

                throw new ArgumentException($"Invalid character: {CurrentChar()}");
            }

            return new Token(Token.Type.End, "");
        }
    }
}
