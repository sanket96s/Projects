#include <stdio.h>
#include<windows.h> // comment this header if not running on windows or running online
#include <stdlib.h>
#include <time.h>
int cur_pos1 = 0, cur_pos2 = 0;
char player1[] = "P1", player2[] = "P2";
// Snakes: 25 to 9  , 65 to 40 , 99 to 1
// Ladder: 13 to 42 , 60 to 83 , 70 to 93
// comment this function if not running on windows or running online
void textcolor(int b)
{
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),b);
}

int rd()
{
    int num;
    time_t t;
    srand((unsigned)time(&t));
    num = rand() % 6 + 1;
    return num;
}
int player1_play()
{
    int temp = 0,dice;
    printf("\nPlayer 1 chance");
    printf("\nEnter 1 for rolling dice : ");
    scanf("%d", &temp);
    if (temp == 1)
    {
        dice = rd();
        cur_pos1 = dice + cur_pos1;
    }
    else
    {
        player1_play();
    }
    return dice;
}
int player2_play()
{
    int temp = 0,dice;
    printf("\nPlayer 2 chance");
    printf("\nEnter 2 for rolling dice : ");
    scanf("%d", &temp);
    if (temp == 2)
    {
        dice = rd();
        cur_pos2 = dice + cur_pos2;
    }
    else
    {
        player2_play();
    }
    return dice;
}

void display()
{
    int i, j, a, diceres;

    if (cur_pos1 == 100)
    {
        printf("\nCongratulations!!!!!! \t\tPlayer %s wins", player1);
        exit(0);
    }
    else if (cur_pos2 == 100)
    {
        printf("Congratulations!!!!!! \t\tPlayer %s wins", player2);
        exit(0);
    }
    printf("\n\n");
    for (i = 10; i > 0; i--)
    {
        a = i - 1;
        for (j = 1; j <= 10; j++)
        {
            diceres = (a * 10) + j;

            if (cur_pos1 == diceres)
            {
                textcolor(14); // comment this header if not running on windows or running online
                printf("%s\t", player1);
            }
            else if (cur_pos2 == diceres)
            {
                textcolor(4); // comment this header if not running on windows or running online
                printf("%s\t", player2);
            }
            else
            {
                textcolor(15); // comment this header if not running on windows or running online
                printf("%d\t", diceres);
            }
        }
        printf("\n\n");
    }
}
void main()
{
    int dice;
    while (1)
    {
        dice = player1_play();
        system("cls");
        printf("\nYour dice value is : %d", dice);
        if (cur_pos1 < 101)
        {
            if (cur_pos1 == 13)
            {
                cur_pos1 = 42; // ladder
                display();
            }
            else if (cur_pos1 == 25)
            {
                cur_pos1 = 9; // snake
                display();
            }
            else if (cur_pos1 == 60)
            {
                cur_pos1 = 83; // ladder
                display();
            }
            else if (cur_pos1 == 65)
            {
                cur_pos1 = 40; // snake
                display();
            }
            else if (cur_pos1 == 70)
            {
                cur_pos1 = 93; // ladder
                display();
            }
            else if (cur_pos1 == 99)
            {
                cur_pos1 = 1; // snake
                display();
            }
            else
            {
                display();
            }
        }
        else
        {
            cur_pos1 = cur_pos1 - dice;
            display();
        }

        dice = player2_play();
        system("cls");
        printf("\nYour dice value is : %d", dice);
        if (cur_pos2 < 101)
        {
            if (cur_pos2 == 13)
            {
                cur_pos2 = 42; // ladder
                display();
            }
            else if (cur_pos2 == 25)
            {
                cur_pos2 = 9; // snake
                display();
            }
            else if (cur_pos2 == 60)
            {
                cur_pos2 = 83; // ladder
                display();
            }
            else if (cur_pos2 == 65)
            {
                cur_pos2 = 40; // snake
                display();
            }
            else if (cur_pos2 == 70)
            {
                cur_pos2 = 93; // ladder
                display();
            }
            else if (cur_pos2 == 99)
            {
                cur_pos2 = 1; // snake
                display();
            }
            else
            {
                display();
            }
        }
        else
        {
            cur_pos1 = cur_pos1 - dice;
            display();
        }
    }
}
