print()
print("Athlete Tracker Template")
print("------------------------")
print("1. Login")
print("2. Register")
print("3. Quit")
print()
user_input = input("Enter selection: ")

if user_input == 1:
    login_page()
if user_input == 2:
    register_page()
if user_input == 3:
    exit_page()
else:
    print("Select a valid option")

def login_page():
    print()
    print()
    print()
    print("Welcome back! Please Login Below")
    username = input("Username: ")
    password = input("Password: ")


def register_page():
    print()
    print()
    print()
    print("Please Register Below")
    username = input("Username: ")
    password = input("Password: ")
