package roteiro07.parte03;

import java.util.Arrays;

public class GridContainer extends Container {
    private Components[][] elements;
    private int lineCounter = 0;
    private int columnCounter = 0;
    private int ColumnMax;
    private int lineMax;

    public GridContainer(int lineMax, int ColumnMax) {
        this.lineMax = lineMax;
        this.ColumnMax = ColumnMax;

        this.elements = new Components[lineMax][ColumnMax];
    }

    @Override
    public void addComponent(Components c) {
        if (this.lineCounter == this.lineMax && this.columnCounter == this.ColumnMax) {
            System.out.println("Não é possivel adicionar novos elementos");
        } else {
            this.elements[this.lineCounter][this.columnCounter] = c;
            this.columnCounter++;
            if (columnCounter == this.ColumnMax) {
                this.lineCounter++;
                if (this.lineCounter < this.lineMax) {
                    this.columnCounter = 0;
                }
            }
        }
    }

    @Override
    public void removerComponent(Components c) {
        for (int i = 0; i < this.lineMax; i++) {
            for (int j = 0; j < this.ColumnMax; j++) {
                if (this.elements[i][j] == c) {
                    this.elements[i][i] = null;
                }

            }
        }
    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(Arrays.deepToString(elements));
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");
    }

}
