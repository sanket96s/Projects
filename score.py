import os


class CricketScoreboard:
    t1_run = 0
    t2_run = 0
    t1_wicket = 0
    t2_wicket = 0
    balls1 = 0
    balls2 = 0

    def balls_to_overs(self, balls):
        overs1 = balls // 6
        remaining_balls = balls % 6
        overs_decimal = overs1 + (remaining_balls / 10)
        return overs_decimal

    def display_score(self):
        os.system('cls')
        print("****************************************** Cricket Score *****************************************************")
        print()
        print(team1, " team Score is : ")
        print("Runs " + " " * 15 + ":", end="")
        print(" " * 15 + str(self.t1_run))
        print("Wicket " + " " * 13 + ":", end="")
        print(" " * 15 + str(self.t1_wicket))
        print("Overs " + " " * 14 + ":", end="")
        print(" " * 15 + str("{0:.1f}".format(self.balls_to_overs(self.balls1), 1)))
        print()
        print(team2, " team Score is : ")
        print("Runs " + " " * 15 + ":", end="")
        print(" " * 15 + str(self.t2_run))
        print("Wicket " + " " * 13 + ":", end="")
        print(" " * 15 + str(self.t2_wicket))
        print("Overs " + " " * 14 + ":", end="")
        print(" " * 15 + str("{0:.1f}".format(self.balls_to_overs(self.balls2), 1)))
        print()
        if(self.t1_wicket==10 and self.t2_wicket==10):
            if self.t1_run > self.t2_run:
                print(team1, " is win the match")
            elif self.t2_run > self.t1_run:
                print(team2, " is win the match")  
        elif (self.balls1 == (overs*6) and self.balls2 == (overs*6)):
            if self.t1_run > self.t2_run:
                print(team1, " is win the match")
            elif self.t2_run > self.t1_run:
                print(team2, " is win the match")
        print("**************************************************************************************************************")

    def update_score_t1(self, runs, wickets, balls):
        self.t1_run += runs
        self.t1_wicket += wickets
        self.balls1 += balls

    def update_score_t2(self, runs, wickets, balls):
        self.t2_run += runs
        self.t2_wicket += wickets
        self.balls2 += balls

    def get_score_1(self):
        print("1.Good ball\n2.No ball\n3.Free hit\n4.Wide ball")
        choice_ball = int(input("Enter you choice : "))
        if choice_ball == 1:
            run = int(input("Enter runs scored : "))
            wicket = int(input("Enter wicket fallen : "))
            ball = 1
            obj.update_score_t1(run, wicket, ball)
        elif choice_ball == 2:
            run = int(input("Enter runs scored : "))
            run += 1
            wicket = 0
            ball = 0
            obj.update_score_t1(run, wicket, ball)
        elif choice_ball == 3:
            run = int(input("Enter runs scored : "))
            wicket = 0
            ball = 1
            obj.update_score_t1(run, wicket, ball)
        elif choice_ball == 4:
            run = int(input("Enter runs scored : "))
            run += 1
            wicket = int(input("Enter wicket fallen : "))
            ball = 0
            obj.update_score_t1(run, wicket, ball)
        os.system('cls')

    def get_score_2(self):
        print("1.Good ball\n2.No ball\n3.Free hit\n4.Wide ball")
        choice_ball = int(input("Enter you choice : "))
        if choice_ball == 1:
            run = int(input("Enter runs scored : "))
            wicket = int(input("Enter wicket fallen : "))
            ball = 1
            obj.update_score_t2(run, wicket, ball)
        elif choice_ball == 2:
            run = int(input("Enter runs scored : "))
            run += 1
            wicket = 0
            ball = 0
            obj.update_score_t2(run, wicket, ball)
        elif choice_ball == 3:
            run = int(input("Enter runs scored : "))
            wicket = 0
            ball = 1
            obj.update_score_t2(run, wicket, ball)
        elif choice_ball == 4:
            run = int(input("Enter runs scored : "))
            run += 1
            wicket = int(input("Enter wicket fallen : "))
            ball = 0
            obj.update_score_t2(run, wicket, ball)
        os.system('cls')


os.system('cls')
overs = int(input("Enter number of Overs :  "))
team1 = input("Enter name of first team : ")
team2 = input("Enter name of second team : ")
toss = int(input(f"Enter who bat first (1 for {team1} / 2 for {team2}) : "))
obj = CricketScoreboard()
os.system('cls')

if toss == 1:
    while ((obj.balls1 < (overs*6))):
        if obj.t1_wicket == 10:
            break
        print("----------------------------------------------------------------------------")
        print("1.update_score\n2.display_score")
        print("----------------------------------------------------------------------------")
        choice1 = int(input("Enter your choice (1/2): "))
        if choice1 == 1:
            os.system('cls')
            obj.get_score_1()
            os.system('cls')
        elif choice1 == 2:
            obj.display_score()
    while ((obj.balls2 < (overs*6))):
        if obj.t2_wicket == 10:
            break
        print("----------------------------------------------------------------------------")
        print("1.update_score\n2.display_score")
        print("----------------------------------------------------------------------------")
        choice1 = int(input("Enter your choice (1/2): "))
        if choice1 == 1:
            os.system('cls')
            obj.get_score_2()
            os.system('cls')
        elif choice1 == 2:
            obj.display_score()

elif toss == 2:
    while ((obj.balls2 < (overs*6))):
        if obj.t2_wicket==10:
            break
        print("----------------------------------------------------------------------------")
        print("1.update_score\n2.display_score")
        print("----------------------------------------------------------------------------")
        choice1 = int(input("Enter your choice (1/2): "))
        if choice1 == 1:
            os.system('cls')
            obj.get_score_2()
            os.system('cls')
        elif choice1 == 2:
            obj.display_score()
    while ((obj.balls1 < (overs*6))):
        if obj.t1_wicket==10:
            break
        print("----------------------------------------------------------------------------")
        print("1.update_score\n2.display_score")
        print("----------------------------------------------------------------------------")
        choice1 = int(input("Enter your choice (1/2): "))
        if choice1 == 1:
            os.system('cls')
            obj.get_score_1()
            os.system('cls')
        elif choice1 == 2:
            obj.display_score()
obj.display_score()
