# AthleteSTTracker
Main Goal: Create an easily accessible program that records, predicts, and displays data on athletes which can be useful for strength and conditioning. I want this program to be utilized by and for my school’s strength and conditioning program


# Project goals: 
- Create an interface where trainers can input their athletes data to keep track
  - * Trainer sets reps for each athlete
    * Athlete records what they do
    * If higher than projected, update their goal
    * Example: On a set day, instead of 5 reps, we’d want 155 till failure, if they do more than 5, it would up their average for future                   reps. If they do 155, 5 times, 85% for 5 reps is 10/10. If they do 7 or 3 (less or more) reps then it is a 8 or 9 out of 10                 workout and we change the weight
   
# Project features:
- Have a section for trainer login, and student login so trainers can set workouts for students
- Workout planner
  - * Trainers design workouts, reps, weights, how many rounds, and goal
    * Students have to be able to record their weight and reps, and if they didn’t do it
    * Students should be able to designate their trainer or their team
    * Trainers should be able to organize students by team
    * Create login page with gender, team, height, position, Age, class, last recorded weight

# Programs to utilize/checkout:
- Fire base
- API
- Spring boot
- SQL light
- Flask (backend)
- D3 (graphs)

# Initial problems:
- Deployment may be an issue
  - Deploying flask: greengeeks.com (small price), pythonanywhere.com (free and easy)

# Examples to look at for inspiration:
- Team builder app (upload workout
  
# Steps:
- Start by making the program in Java like our previous projects,
- Create an html interface, connecting the Java project into the backend

# Current Focus:
- Create Login and New User methods
- New Users should input their posiiton (Trainer/Athlete), Sports Team (Given options), First and last name, Age, Weight, Height, Birth gender
- Trainers do not need to input their stats as they do not need to be recorded, only that they will control the athletes

