import random

def get_data():
    data = [ ["hangman", "A game where you guess a word."], ["python", "A programming language."], ["programming", "The act of writing code."], ["coding", "Creating software."], ["developer", "A person who writes code."], ["openai", "An artificial intelligence research laboratory."], ["keyboard", "An input device for computers."], ["algorithm", "A step-by-step procedure for solving a problem."], ["database", "A structured collection of data."], ["variable", "A container for storing data value."], ["function", "A reusable block of code."], ["debugging", "Finding and fixing errors in a program."], ["interface", "A point where two systems meet."],["iteration", "Repeating a process to achieve a desired result."],["boolean", "A data type with two possible values: True or False."], ["syntax", "The set of rules that dictate how programs are written."], ["version", "A specific edition or release of a software product."], ["repository", "A storage location for software packages."], ["encryption", "The process of converting information into a code."], ["framework", "A platform for developing software applications."], ["prototype", "An early model or release of a product."]]
    return random.choice(data)

def display(guessed_word):
    print("Guessed letters: ", end="")
    for i in guessed_word:
        print(i, end=" ")
    print("\n\n----------------------------------")

def hangman_game():
    print("\n\n---------------Hangman Game---------------\n")
    x = get_data()
    word = x[0]
    hint = x[1]
    a = 6
    print("Number of attempts: 6\n")
    print("----------------------------------\n")
    print("Guess the word")
    print(f"Hint:{hint}\n\n----------------------------------")
    word_c = list(word)
    l = len(word)
    guessed_word = ["_"]*l
    while(a>0):
        print("\nGuess the letter: ", end="")
        guess = input()
        if guess in word_c:
            print("---CORRECT GUESS---")
            x = word_c.index(guess)
            guessed_word[x] = guess
            word_c[x] = 0
            display(guessed_word)
        else:
            a-=1
            if a!=0:
                print(f"---WRONG GUESS. Only {a} more  attempts---")
                display(guessed_word)
                print(f"\nHint:{hint}")
            else:
                print(f"---WRONG GUESS---\n")
        if "_" not in guessed_word:
            print(f"\n---Congrats!!!Word guess complete: {word}---\n\n----------------------------------")
            break
    else:
        print(f"----------------------------------\n\n---Sorry, no more attempts. The word that is to be guessed: {word}---\n\n----------------------------------")

hangman_game()
