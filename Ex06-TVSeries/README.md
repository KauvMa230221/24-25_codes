---
author: hasp, pota
topic: java, oop basics
tag: 2425-2xHIT
---

# TV Series

Sie schreiben ein Programm um ihre Top 5 Lieblingserien zu verwalten.

Dazu erstellen Sie eine Klasse **TVSeries**. Mit dieser können Sie eine Serie auf einem Platz 1 - 5 hinzufügen und die Serien als String ausgeben.


Die Klasse soll 1 Attribute haben:

* String [] **series** Array mit der Länge 5 für die Lieblingserien.


Die Klasse soll zwei public Methoden haben

```java
int addSeries(String name, int place);
```

Damit kann eine Serie an einem bestimmten Platz hinzugefügt werden. Die Serien die schon in der Liste darunter sind müssen 
natürlich einen Platz nach unten rutschen.

Z.B:
Die Liste sieht so aus:
`[Cobra Kai, Breaking Bad, Mad Men, Prison Break, Friends]`

Jetzt fügen Sie an der Stelle 3 die Serie Squid Game hinzu.

`[Cobra Kai, Breaking Bad, Squid Game, Mad Men, Prison Break]`

Mad Men und Prison Break sind einen Platz nach unten gerutscht. Friends ist aus der Liste raus gefallen.

Wird als Index Zahl übergeben die außerhalb des Arrays liegt soll -1 zurückgegeben werden. Ansonsten 0.

```java
String showSeries();
```

Gibt die Liste als String zurück. Dazu können Sie `Arrays.toString()` verwenden.