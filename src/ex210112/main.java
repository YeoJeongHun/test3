package ex210112;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int command, idx = 0, searchIdx;
		add_content[] text = new add_content[100];

		while (true) {
			System.out.println("1 : ����");
			System.out.println("2 : �Խù� �߰�");
			System.out.println("3 : �Խù� ���� ����");
			System.out.printf("����� �Է��ϼ��� : ");
			command = sc.nextInt();

			if (command == 1) {
				System.out.println("���α׷� ����");
				break;
			}
			else if (command == 2) {
				text[idx] = new add_content();
				System.out.println("���� : ");
				text[idx].setObj(sc.next());
				System.out.println("���� : ");
				text[idx].setContent(sc.next());

				System.out.println("�Խù� ��ϵǾ����ϴ�.");
				text[idx].setIdx(idx);
				idx++;
				if (idx >= 100) {
					System.out.println("���̻� �Խñ��� ����� �� �����ϴ�.");
				}
			}
			else if (command == 3) {
				for (int i = 0; i < idx; i++) {
					System.out.printf("%d���� - ���� : %s\n", text[i].getIdx(), text[i].getObj());
					System.out.println("=================================");
				}
				System.out.printf("�� ��ȣ�� �Է��ϼ��� : ");
				searchIdx=sc.nextInt();
				System.out.printf("���� : %s\n���� : %s\n",text[searchIdx].getObj(),text[searchIdx].getContent());
				System.out.println("============================");
			}
			else System.out.println("�߸��� �Է��Դϴ�.");

		}
	}

}
