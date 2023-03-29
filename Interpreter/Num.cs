using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter
{
    public class Num : AST
    {
        public int Value;

        public Num(Token token)
        {
            Value = Int32.Parse(token.Value);
        }

        public override int Evaluate()
        {
            return Value;
        }
    }
}
