import java.util.Scanner;

public class DelMang {

    int rootAraay[] = new int[20];

    int size;

    void inputSize() {
        do {
            System.out.println("Nhap do dai cua mang: ");
            Scanner sc = new Scanner(System.in);
            this.size = sc.nextInt();
        } while (this.size >= 20 || this.size < 0);
    }


    void inputArray() {
        for (int i = 0; i < this.size; i++) {
            System.out.println("a[" + i + "]= ");
            Scanner sc = new Scanner(System.in);
            this.rootAraay[i] = sc.nextInt();

        }
    }


    void insertElement(int indexInsert) {

        if (indexInsert >= 0 && indexInsert <= this.size) {
            for (int i = this.size; i >= indexInsert; i--) {
                this.rootAraay[indexInsert] = this.rootAraay[i];
            }
            this.size--;
        } else {
            System.out.println("Vi tri khong hop le");
        }
    }



    void displayArray() {
        System.out.println("Mang sau khi xoa");
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.rootAraay[i] + "");
        }
    }


    public static void main(String[] args) {
        DelMang xoa = new DelMang();
        xoa.inputSize();
        xoa.inputArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vi tri can xoa: ");
        int x = scanner.nextInt();
        xoa.insertElement(x);
        xoa.displayArray();

    }
}
