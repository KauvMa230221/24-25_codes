---
author: hasp, pota
topic: java, oop basics
tag: 2425-2xHIT
---

# Tic Tac Toe

Sie schreiben ein Programm für das Spiel Tic Tac Toe. ![https://de.wikipedia.org/wiki/Tic-Tac-Toe]

Dazu erstellen Sie eine Klasse **TicTacToe**. Diese beinhaltet das Spielfeld und berechnet ob ein Spieler gewonnen hat.

Dazu soll die Klasse 1 Attribute haben:

* `char[][] gameBoard = new char[3][3]`; 

Dabei handelt es sich um eine zweidimensionales Array. Auf die einzelnen Werte kann mit

```java
int zeile = 0;
int spalte = 1;
char c = gameBoard[zeile][spalte];
```
zugegriffen werden.

Im Spiel kann das Array drei Werte annehmen:

- `' '` Feld ist frei
- `'x'` Belegt von Spieler x
- `'o'` Belegt von Spieler o

Die Klasse soll 5 public Methoden haben

### Konstruktor

```java
//Konstruktor
TicTacToe();
```

Im Konstruktor soll das gameBoard Array auf lauter Leerzeichen `' '` initialisiert werden.

### ToString

```java
String toString()
```

Mit dieser Methode soll das Spielfeld als String zurückgegeben werden (Dieser kann dann auf der Konsole ausgegeben werden). 
Das Spielfeld soll so aussehen:

leer
```txt
 | | 
-+-+-
 | | 
-+-+-
 | | 
```

oder teilweise gefüllt 

```txt
 |x| 
-+-+-
 |x|o
-+-+-
 |o| 
```

### setMark

```java
public boolean setMark(int r, int c, char mark)
```

Mit dieser Funktion kann ein Spieler ein Feld beschreiben. Wobei r die Zeile(row) , c die Spalte(column) und mark das Zeichen ist.

Z.B: `setMark(0,0,'x');` liefert

```txt
x| | 
-+-+-
 | | 
-+-+-
 | | 
```

`setMark(2,0,'0');` liefert

```txt
x| | 
-+-+-
 | | 
-+-+-
o| | 
```

`setMark(1,2,'x');` liefert

```txt
x| | 
-+-+-
 | |x
-+-+-
o| | 
```

Wurde ein Feld beschrieben soll true zurückgegeben werden.

Die Funktion soll false zurückgeben wenn:
- Der Index außerhalb des Feldes ist.
- Das Spielfeld an dieser Stelle nicht mehr frei ist.
- Das Zeichen kein `'x'` oder `'o'` ist.

### Winner

```java
public char winner()
```

Mit dieser Funktion kann ermittelt werden ob ein Spieler gewonnen hat. Folgende Rückgabewerte sollen möglich sein.

- `x` Spieler x hat gewonnen
- `o` Spieler o hat gewonnen
- ` ` Kein Spieler hat gewonnen

### BoardFull

```java
public boolean boardFull()
```

Diese Funktion wird benötigt um festzustellen ob ein Spiel unentschieden ausgegangen ist. Die Funktion liefert true zurück wenn das Spielfeld voll ist ansonsten false.

## Main

In der Main Funktion sollen die Konsolen Ein und Ausgabe für das Spiel gemacht werden. Für die Logik soll die Klasse TicTacToe verwendet werden. Das Dialog kann so aussehen:

```txt
 | | 
-+-+-
 | | 
-+-+-
 | | 

Spieler x Zeile
0
Spieler x Spalte
0
x| | 
-+-+-
 | | 
-+-+-
 | | 

Spieler o Zeile
0
Spieler o Spalte
1
x|o| 
-+-+-
 | | 
-+-+-
 | | 

Spieler x Zeile
1
Spieler x Spalte
1
x|o| 
-+-+-
 |x| 
-+-+-
 | | 

Spieler o Zeile
2
Spieler o Spalte
2
x|o| 
-+-+-
 |x| 
-+-+-
 | |o

Spieler x Zeile
1
Spieler x Spalte
0
x|o| 
-+-+-
x|x| 
-+-+-
 | |o

Spieler o Zeile
1
Spieler o Spalte
2
x|o| 
-+-+-
x|x|o
-+-+-
 | |o

Spieler x Zeile
2
Spieler x Spalte
0
x|o| 
-+-+-
x|x|o
-+-+-
x| |o

Spieler x hat gewonnen 
```



