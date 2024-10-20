---
author: hasp, pota
topic: java, oop basics
tag: 2425-2xHIT
---

# Robot


Sie Programmieren eine Software für einen Staubsaugerroboter. Der Roboter bewegt sich dabei in einem Koordinatensystem das wie folgt aussieht:

Koordinatensystem
```txt
+--------> X+
|
|
|
Y+
```

Der Roboter hat 3 Funktionen um sich zu bewegen:

- Vorwärts fahren
- Rechts drehen
- Links drehen.

Zur Lösung erstellen Sie eine Klasse **Robot**.

Die Klasse soll 3 Attribute haben:

* int **xPos** aktuelle x Position
* int **yPos** aktuelle y Position
* int **direction** Richtung in die der Roboter zeigt und somit bei `MoveForward` fährt.

Wobei bei direction folgende Werte folgendes heißen:

- **0** X+
- **1** Y+
- **2** X-
- **3** Y-

Die Klasse soll 5 Methoden haben

* **Getter** Getter für die Attribute xPos und yPos
* **void moveForward(int dist)** Der Roboter bewegt sich um int dist in Richtung der aktuellen Direction.
* **turnRight()** Dreht den Roboter nach rechts.
* **turnLeft()** Dreht den Roboter nach links.