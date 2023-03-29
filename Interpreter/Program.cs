using System;
using System.Collections.Generic;

namespace Interpreter
{

    class Program
    {
        static void Main(string[] args)
        {
            string text = "8 + (2 * 10)";
            Interpreter interpreter = new Interpreter(text);
            Console.WriteLine(interpreter.Interpret()); // output: 22
        }
    }
}