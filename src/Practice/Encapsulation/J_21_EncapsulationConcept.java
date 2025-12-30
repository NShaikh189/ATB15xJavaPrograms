package Practice.Encapsulation;

public class J_21_EncapsulationConcept {


    private static String s_msg = "TEST";
    private final String F_MSG = "FINAL VARIABLE";
    private int emp_id;
    private String msg;

    public static String getS_msg() {
        return s_msg;
    }

    public static void setS_msg(String s_msg) {
        J_21_EncapsulationConcept.s_msg = s_msg;
    }

    public int getEmp_id() {
        return this.emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getF_MSG() {
        return F_MSG;
    }


}
