using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter
{
    public class Interpreter
    {
        private readonly Parser parser;

        public Interpreter(string text)
        {
            Lexer lexer = new Lexer(text);
            parser = new Parser(lexer);
        }

        public int Interpret()
        {
            AST tree = parser.Expr();
            return tree.Evaluate();
        }
    }
}
