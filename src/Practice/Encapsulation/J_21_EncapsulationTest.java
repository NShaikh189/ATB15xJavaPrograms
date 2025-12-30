package Practice.Encapsulation;

public class J_21_EncapsulationTest {
    public static void main(String[] args) {
        J_21_EncapsulationConcept obj = new J_21_EncapsulationConcept();
        obj.setEmp_id(100);
        System.out.println(obj.getEmp_id());

        obj.setMsg("Welcome" );
        System.out.println(obj.getMsg());

        System.out.println(J_21_EncapsulationConcept.getS_msg());
        J_21_EncapsulationConcept.setS_msg("Hello");
        System.out.println(J_21_EncapsulationConcept.getS_msg());

        System.out.println(obj.getF_MSG());


    }
}
