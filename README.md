# Silence Speaks Java Project

[![GitHub commit activity](https://img.shields.io/github/commit-activity/t/RoBizMan/silence-speaks-java-project)](https://github.com/RoBizMan/silence-speaks-java-project/commits/main)
[![GitHub last commit](https://img.shields.io/github/last-commit/RoBizMan/silence-speaks-java-project)](https://github.com/RoBizMan/silence-speaks-java-project/commits/main)
[![GitHub repo size](https://img.shields.io/github/repo-size/RoBizMan/silence-speaks-java-project)](https://github.com/RoBizMan/silence-speaks-java-project)

---

This repository contains my solutions to the Java coding project provided by Silence Speaks.

---

## Table of Contents
- [Running the Programs](#running-the-programs)
- [Connected Cities Checker](#connected-cities-checker)
- [Testing](#testing)
- [Agile Development Process](#agile-development-process)
- [GitHub Issues](#github-issues)
- [Credits](#credits)

---

## Running the Programs

This project can be cloned or forked in order to make a local copy on your own system. Ensure you have Java and Maven installed on your machine.

### Cloning

You can clone the repository by following these steps:

1. Go to the [GitHub repository](https://github.com/RoBizMan/silence-speaks-java-project) 
2. Locate the Code button above the list of files and click it 
3. Select if you prefer to clone using HTTPS, SSH, or GitHub CLI and click the copy button to copy the URL to your clipboard
4. Open Git Bash or Terminal
5. Change the current working directory to the one where you want the cloned directory
6. In your IDE Terminal, type the following command to clone my repository:
    - `git clone https://github.com/RoBizMan/silence-speaks-java-project.git`
7. Press Enter to create your local clone.

### Forking

By forking the GitHub Repository, we make a copy of the original repository on our GitHub account to view and/or make changes without affecting the original owner's repository.
You can fork this repository by using the following steps:

1. Log in to GitHub and locate the [GitHub Repository](https://github.com/RoBizMan/silence-speaks-java-project)
2. At the top of the Repository (not top of page) just above the "Settings" Button on the menu, locate the "Fork" Button.
3. Once clicked, you should now have a copy of the original repository in your own GitHub account!

---

## Connected Cities Checker
This program checks if two cities nodes are connected based on provided connections in a text file.

### Instructions

1. Prepare a `CitiesNodes.txt` file with city pairs inside the `connected_cities` folder.

Sample `CitiesNodes.txt` file:

```
London, Bristol
Bristol, Birmingham
Plymouth, Nottingham
```

2. Compile the program:

```
javac src/main/java/connected_cities/ConnectedCitiesChecker.java -d app
```

3. Run the program:

```
java -cp app connected_cities.ConnectedCitiesChecker
```

4. Input two city names when prompted.

### Example Usage

#### If two cities nodes are connected with edges:

```
Graph loaded successfully
Enter the first city (or type 'exit' to quit): London
Enter the second city (or type 'exit' to quit): Bristol
London and Bristol are connected.
```

#### If two cities nodes are not connected with edges:

```
Graph loaded successfully
Enter the first city (or type 'exit' to quit): Plymouth
Enter the second city (or type 'exit' to quit): Leicester
Plymouth and Leicester are NOT connected.
```

---

## Testing

Each program includes unit tests to verify functionality.

**It is mandatory to have Maven installed in your system in order to run tests.**

### Connected Cities Checker

To run tests, use:

```
mvn test
```

---

## Agile Development Process

### GitHub Projects

[GitHub Projects](https://github.com/users/RoBizMan/projects/8) served as an Agile tool for this project. It isn't a specialised tool, but with the right tags and project creation/issue assignments, it can work.

Through it, user stories, issues, and milestone tasks were planned and tracked weekly using the basic Kanban board.

### GitHub Issues

[GitHub Issues](https://github.com/RoBizMan/silence-speaks-java-project/issues) served as another Agile tool.

It also helped with milestone iterations.

#### Open Issues

- [Open Issues](https://github.com/RoBizMan/silence-speaks-java-project/issues) [![GitHub issues](https://img.shields.io/github/issues/RoBizMan/silence-speaks-java-project)](https://github.com/RoBizMan/silence-speaks-java-project/issues)

#### Closed Issues

- [Closed Issues](https://github.com/RoBizMan/silence-speaks-java-project/issues?q=is%3Aissue%20state%3Aclosed) [![GitHub closed issues](https://img.shields.io/github/issues-closed/RoBizMan/silence-speaks-java-project)](https://github.com/RoBizMan/silence-speaks-java-project/issues?q=is%3Aissue%20state%3Aclosed)

---

## GitHub Issues

### Fixed Bugs

[![GitHub issue custom search](https://img.shields.io/github/issues-search?query=repo%3ARoBizMan%2Fsilence-speaks-java-project%20label%3Abug&label=bugs)](https://github.com/RoBizMan/silence-speaks-java-project/issues?q=is%3Aissue%20label%3Abug)

[![GitHub closed issues](https://img.shields.io/github/issues-closed/RoBizMan/silence-speaks-java-project)](https://github.com/RoBizMan/silence-speaks-java-project/issues?q=is%3Aissue+is%3Aclosed)

All previously closed/fixed bugs can be tracked [here](https://github.com/RoBizMan/silence-speaks-java-project/issues?q=is%3Aissue+is%3Aclosed).

| Bug |	Status |
| - | - |
| [Text file not found while compiling Java](https://github.com/RoBizMan/silence-speaks-java-project/issues/25) | Closed |

### Open Issues

[![GitHub issues](https://img.shields.io/github/issues/RoBizMan/silence-speaks-java-project)](https://github.com/RoBizMan/silence-speaks-java-project/issues)

Any remaining open issues can be tracked [here](https://github.com/RoBizMan/silence-speaks-java-project/issues).

No open issues so far.

### Unfixed Bugs

[!NOTE]
There are no remaining bugs that I am aware of.

---

## Credits

| Source | Notes |
| - | - |
| [DigitalOcean](https://www.digitalocean.com/community/tutorials/junit-setup-maven) | JUnit Setup Maven - JUnit 4 and JUnit 5 |
| [JUnit 5](https://junit.org/junit5/) | JUnit 5 |
| [Apache Maven Project](https://maven.apache.org/plugins/maven-compiler-plugin/usage.html) | Compiling Your Java Sources |
| [Apache Maven Project](https://maven.apache.org/pom.html) | POM Reference |
| [Geeks for Geeks](https://www.geeksforgeeks.org/graph-types-and-applications/?ref=lbp) | Types of Graphs with Examples |
| [Stack Overflow](https://stackoverflow.com/questions/1737627/java-how-to-represent-graphs) | Java: how to represent graphs? |
| [Kumar Chandrakant](https://www.baeldung.com/java-graphs) | Graphs in Java |
| [Geeks for Geeks](https://www.geeksforgeeks.org/implementing-generic-graph-in-java/) | Implementing Generic Graph in Java |
| [Javatpoint](https://www.javatpoint.com/java-graph) | Java Graph |
| [W3Schools](https://www.w3schools.com/java/) | Java Tutorial |
| [Milos Simic](https://www.baeldung.com/cs/dfs-vs-bfs) | Depth-First Search vs. Breadth-First Search |
| [Siddosamith](https://siddosamith.medium.com/graph-traversals-in-java-dfs-bfs-a91910f6b9f9) | Graph Traversals in Java DFS & BFS |
| [Javatpoint](https://www.javatpoint.com/bfs-vs-dfs) | BFS vs. DFS |