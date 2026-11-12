# Workshop 6 – Java Collections & OOP Concepts

Solutions to the seven exercises of Workshop 6 (Melbourne Polytechnic).
Each exercise lives in its own folder so it can be opened, run and screenshotted
independently in VS Code.

| Exercise | Difficulty | Folder | Class(es) |
|----------|------------|--------|-----------|
| 1 – Favourite songs and artists | Easy | `src/exercise1` | `Playlist` |
| 2 – Songs in alphabetical order (bubble sort) | Hard | `src/exercise2` | `PlaylistSorted` |
| 3 – Reverse the letters of every word | Medium | `src/exercise3` | `ReverseWords` |
| 4 – Decode a coded message | Easy | `src/exercise4` | `Decoder` |
| 5 – Search engine over 10 paragraphs | Medium | `src/exercise5` | `SearchEngine` |
| 6 – Class variables vs instance variables | Easy | `src/exercise6` | `IdentifyMyParts` |
| 7 – The `Boxes` class (two classes) | Medium | `src/exercise7` | `Boxes`, `BoxesDriver` |

## Running the programs

### In VS Code

1. Open this folder in VS Code (`File > Open Folder`).
2. Install the **Extension Pack for Java** if it is not installed yet.
3. Open the `.java` file you want to run and press **Run** (the ▷ button in the
   top-right corner), or right-click the file and choose
   **Run Java**. The output appears in the **TERMINAL** panel.

### In a terminal

```bash
# single class exercises
java src/exercise1/Playlist.java
java src/exercise2/PlaylistSorted.java
java src/exercise3/ReverseWords.java
java src/exercise4/Decoder.java
java src/exercise5/SearchEngine.java
java src/exercise6/IdentifyMyParts.java

# exercise 7 has two classes
javac -d out src/exercise7/*.java
java -cp out BoxesDriver
```

## Expected output

**Exercise 1 – Playlist**

```
MY 10 FAVOURITE SONGS
---------------------
1. Bohemian Rhapsody - Queen
2. Shape of You - Ed Sheeran
3. Blinding Lights - The Weeknd
4. Hotel California - Eagles
5. Rolling in the Deep - Adele
6. Bad Guy - Billie Eilish
7. Imagine - John Lennon
8. Levitating - Dua Lipa
9. Stay - The Kid LAROI
10. Hey Jude - The Beatles
```

**Exercise 2 – PlaylistSorted** (bubble sort on the titles; both arrays are
swapped together so every song keeps its own artist)

```
MY SONGS IN ALPHABETICAL ORDER
------------------------------
1. Bad Guy - Billie Eilish
2. Blinding Lights - The Weeknd
3. Bohemian Rhapsody - Queen
4. Hey Jude - The Beatles
5. Hotel California - Eagles
6. Imagine - John Lennon
7. Levitating - Dua Lipa
8. Rolling in the Deep - Adele
9. Shape of You - Ed Sheeran
10. Stay - The Kid LAROI
```

**Exercise 3 – ReverseWords**

```
Original : To be or not to be.
Reversed : oT eb ro ton ot eb.
```

The full stop is kept at the end of the word instead of being reversed with it.

**Exercise 4 – Decoder**

```
Coded   : G tgsl Qefe.
Decoded : I like Java.
```

The key is stored in the two arrays `CIPHER` and `PLAIN`, so another message
can be decoded simply by adding the matching pairs to those arrays.

**Exercise 5 – SearchEngine**

```
Found "keyword search" at index 2:
   That would be like a keyword search.
Found "keyword search" at index 6:
   That is a question to test keyword search.
```

Change the value of `phrase` to test a phrase that is not in the paragraphs;
the program then prints
`The phrase "..." was not found in any paragraph.`

**Exercise 6 – IdentifyMyParts**

`x` is the class variable (declared `static`), `y` is the instance variable.

```
a.y = 5
b.y = 6
a.x = 2
b.x = 2
IdentifyMyParts.x = 2
```

`a.y` and `b.y` keep their own values, while `a.x`, `b.x` and
`IdentifyMyParts.x` all show `2` because there is only one copy of the class
variable and the last assignment (`b.x = 2`) wins.

**Exercise 7 – Boxes / BoxesDriver**

```
Box size: 5 x 5
-----
|   |
|   |
|   |
-----

Box size: 8 x 8
--------
|      |
|      |
|      |
|      |
|      |
|      |
--------

15 requested -> 10 x 10
```

`Boxes` has a constructor that takes the size, a `setSize` method, a
`toString` method that returns e.g. `"10 x 10"`, and a `draw` method.
Sizes above the maximum of 10 are capped at 10.
