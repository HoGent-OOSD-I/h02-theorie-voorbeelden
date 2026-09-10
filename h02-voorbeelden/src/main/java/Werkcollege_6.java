void main() {
    int a = 0, b = 0, c = 0;

    a = ++b  +  ++c;     //  a =       b =       c =

    a = b++  +  c++;     //  a =       b =       c =

    a = ++b  +  c++;     //  a =       b =       c =

    a = b--  +  c--;     //  a =       b =       c =
}
