package ex210112;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int command, idx = 0, searchIdx;
		add_content[] text = new add_content[100];

		while (true) {
			System.out.println("1 : 종료");
			System.out.println("2 : 게시물 추가");
			System.out.println("3 : 게시물 내용 보기");
			System.out.printf("기능을 입력하세요 : ");
			command = sc.nextInt();

			if (command == 1) {
				System.out.println("프로그램 종료");
				break;
			}
			else if (command == 2) {
				text[idx] = new add_content();
				System.out.println("제목 : ");
				text[idx].setObj(sc.next());
				System.out.println("내용 : ");
				text[idx].setContent(sc.next());

				System.out.println("게시물 등록되었습니다.");
				text[idx].setIdx(idx);
				idx++;
				if (idx >= 100) {
					System.out.println("더이상 게시글을 등록할 수 없습니다.");
				}
			}
			else if (command == 3) {
				for (int i = 0; i < idx; i++) {
					System.out.printf("%d번글 - 제목 : %s\n", text[i].getIdx(), text[i].getObj());
					System.out.println("=================================");
				}
				System.out.printf("글 번호를 입력하세요 : ");
				searchIdx=sc.nextInt();
				System.out.printf("제목 : %s\n내용 : %s\n",text[searchIdx].getObj(),text[searchIdx].getContent());
				System.out.println("============================");
			}
			else System.out.println("잘못된 입력입니다.!!!");

		}
	}

}
