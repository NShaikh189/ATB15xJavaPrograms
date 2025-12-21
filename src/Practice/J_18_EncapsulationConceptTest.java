package Practice;

public class J_18_EncapsulationConceptTest {

    static void getEmpDetails(J_18_EncapsulationConcept obj)
    {
        System.out.println(obj.getEmp_id());
        System.out.println(obj.getEmp_name());
        System.out.println(obj.getEmp_age());
    }
    public static void main() {
        J_18_EncapsulationConcept obj1 = new J_18_EncapsulationConcept();
        obj1.setEmp_id(328);
        obj1.setEmp_name("Nayum");
        obj1.setEmp_age((byte)37);

        System.out.println("emp details");
        getEmpDetails(obj1);
    }
}
