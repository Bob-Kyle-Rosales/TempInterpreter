using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter
{
    public class Token
    {
        public enum Type
        {
            Integer,
            Plus,
            Minus,
            Multiply,
            Divide,
            LParen,
            RParen,
            Begin,
            End,
        }

        public Type TokenType;
        public string Value;

        public Token(Type type, string value)
        {
            TokenType = type;
            Value = value;
        }
    }
}
