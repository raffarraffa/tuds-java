package guia10ej03.entidades;

public class DivisionNumero {

    private Integer num_1;
    private Integer num_2;

    public DivisionNumero() {
    }

    public DivisionNumero(Integer num_1, Integer num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    public Integer getNum_1() {
        return num_1;
    }

    public void setNum_1(Integer num_1) {
        this.num_1 = num_1;
    }

    public Integer getNum_2() {
        return num_2;
    }

    public void setNum_2(Integer num_2) {
        this.num_2 = num_2;
    }

    public Integer divisionNumeros() {
        Integer result = null;
        try {
            result = (getNum_1() / getNum_2());

            System.out.println(result);
        } catch (Exception e) {
            System.out.println("excepcion" + e.toString());
        }
        return result;
    }

}
