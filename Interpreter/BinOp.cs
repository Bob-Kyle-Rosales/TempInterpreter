using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter
{
    class BinOp : AST
    {
        public AST Left;
        public AST Right;
        public Token.Type Op;

        public BinOp(AST left, Token token, AST right)
        {
            Left = left;
            Op = token.TokenType;
            Right = right;
        }

        public override int Evaluate()
        {
            int leftValue = Left.Evaluate();
            int rightValue = Right.Evaluate();
            switch (Op)
            {
                case Token.Type.Plus:
                    return leftValue + rightValue;
                case Token.Type.Minus:
                    return leftValue - rightValue;
                case Token.Type.Multiply:
                    return leftValue * rightValue;
                case Token.Type.Divide:
                    return leftValue / rightValue;
                default:
                    throw new ArgumentException("Invalid operator");
            }
        }
    }
}
