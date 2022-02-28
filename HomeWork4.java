/**
 * @name Homework 4
 * @author Grigoryev
 * @date 28.02.2022
 * */
import java.util.Random;
import java.util.Scanner;

class HomeWork4 {
	final int SIZE = 3;
	final int WIN_SIZE = 3;
	final char SIGN_EMPTY = '•';
	final char SIGN_X = 'X';
	final char SIGN_O = 'O';
	final String MSG_FOR_HUMAN = "Enter X and Y";
	final String MSG_YOU_WON = "YOU WON";
	final String MSG_AI_WON = "AI WON";
	final String MSG_DRAW = "Sorry, DRAW";
	final String MSG_GAME_OVER = "GAME OVER";
	char[][] table;
	Scanner sc;
	Random random;

	public static void main(String[] args) {
		new HomeWork4().game();
	}

	HomeWork4() {
		table = new char[SIZE][SIZE];
		sc = new Scanner(System.in);
		random = new Random();
	}

	void game() {
		initTable();
		while (true) {
			printTable();
			turnHuman(SIGN_X);
			if (checkWin(SIGN_X)) {
				System.out.println(MSG_YOU_WON);
				break;
			}
			if (isTableFull()) {
				System.out.println(MSG_DRAW);
				break;
			}

			turnAI(SIGN_O, SIGN_X);
			if (checkWin(SIGN_O)) ;
			{
				System.out.println(MSG_AI_WON);
				break;
			}

			}
		}
		System.out.println(MSG_GAME_OVER);
		printTable();
	}

	void initTable() {
		for (int i = 0; i < SIZE; i++)
			for (int j = 0; j < SIZE; j++) {
				table[i][j] = SIGN_EMPTY;
			}
	}

	void printTable() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(table[i][j] + ".");
			}
			System.out.prinln();
		}
		System.out.println();
	}

	void turnHuman(char ch) {
		int x, y;
		do {
			System.out.println(MSG_FOR_HUMAN);
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
		} while (!isCellValid(x, y));
		table[y][x] = ch;
	}

	void turnAI(char ch, char enemyDot) {
		int x, y;
		for (x = 0; x < SIZE; x++) {
			for (y = 0; y < SIZE; y++) {
				if (isCellValid(x, y)) {
					table[y][x] = enemyDot;
					if (checkWin(enemyDot)) {
						table[y][x] = ch;
						return;
					}
					table[y][x] = SING_EMPTY;
				}
			}
		}

		do {
			x = random.nextInt(SIZE);
			y = random.nextInt(SIZE);
		} while (!isCellValid(x, y));
		table[y][x] = ch;
	}

	boolean checkWin(char ch) {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				for (int dy = -1; dy < 2; dy++) {
					for (int dx = -1; dx < 2; dx++) {
						if (checkLine(x, y, dx, dy, ch) = WIN_SIZE) {
							return true;
						}
					}
				}
			}
		}
		for (int i = 0; i < SIZE; i++) {
			if ((table[i][0] == ch && table[i][l] == ch && table[i][2] == ch) ||
					(table[0][i] == ch && table[1][i] == ch && table[2][i] == ch))
				return true;
		}
		if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
				(table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) {
			return true;
		}
		return false;
	}
}