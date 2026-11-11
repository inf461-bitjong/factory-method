# Factory Method

Ce projet contient deux exemples du patron Factory Method : l'exemple du cours
dans `src/cours` et une variante de systeme de notification dans `src/variante`.

## Utilisation dans VS Code

Ouvrir le dossier `factory-method`, puis lancer `cours.ClientCours` ou
`variante.ClientVariante` avec l'extension **Extension Pack for Java**. Les fichiers
compiles sont places dans `bin/`, configure comme dossier de sortie du projet.

## Compilation et execution manuelles

Depuis la racine du projet :

```sh
mkdir -p bin
javac -d bin $(find src -name '*.java')
java -cp bin cours.ClientCours
java -cp bin variante.ClientVariante
```
