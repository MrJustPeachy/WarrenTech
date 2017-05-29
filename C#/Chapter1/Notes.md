# Chapter 1 –

# Introducing C# and the .NET Framework

C# is an OOP language like Java, Python, and other languages. It does differ from other languages in the following ways:

- --Unified type system: The fundamental object of C# is a type. Every type has a common parent, which provides a base set of functionality.
- --Properties, methods, and events: Unlike other languages, C# has more than one kind of function. Methods are one type of _function member_, along with properties and events. Properties are used to show a piece of an object&#39;s state, like a button&#39;s color / labels text. Events simplify acting on object state changes.

C# has an automatic garbage collector like Java that will collect memory from objects no longer being used. The language runtime is the Microsoft Common Language Runtime (CLR). This runtime is used along with a multitude of other libraries to create the .NET Framework. The CLR creates managed code, which means it takes C# and compiles it into managed code, in either a .exe (executable) or a .dll (library). The CLR will then take this new managed code and turn it into the assembly language.

New features of C# 6.0:

- --The biggest change is the compiler is almost completely redone. This redo is known as &quot;Roslyn&quot; and is completely open source, and can be found at github.com/dotnet/roslyn.
- --Expression-bodied functions are lambda expressions for methods, operators, and indexers that consist of a single expression.
- --Properties can be set to read-only in an expression and in the constructor.