---
author: hasp, pota
topic: java, oop basics
tag: 2425-2xHIT
---

# Password Checker

Erstellen Sie eine Klasse **PasswordChecker**. Mit dieser kann ein Passwort überprüft werden ob es sicher genug ist oder nicht.


Die Klasse soll 3 Attribute haben:

* int **minLength**
* boolean **mustContainNumbers**
* boolean **mustContainUpperAndLowerCase**

Mit diesen werden die Prüfkriterien für das Passwort festgelegt. Programmieren Sie jeweils einen Setter für die Variblen.

Die Klasse soll eine public Methode haben

`boolean checkPassword(String pwd)`

Damit kann überprüft werden ob das Passwort Sicher ist oder nicht.

## Implementierung

Am besten programmieren Sie sich drei private Hilfsfunktionen zum Testen des Passwortes.

- `boolean containsLowerCase(String pwd)`
- `boolean containsUpperCase(String pwd)`
- `boolean containsNumbers(String pwd)`

Zum Überprüfen ob ein Zeichen in einem String groß, klein oder eine Ziffer ist können Sie folgende Methoden verwenden:

- `Character.isUpperCase()`
- `Character.isLowerCase()`
- `Character.isDigit()`