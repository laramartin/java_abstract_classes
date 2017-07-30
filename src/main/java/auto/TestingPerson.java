package auto;


public class TestingPerson {

    public void test() {

        Person lara = Person.builder()
                .setId(1)
                .setName("Lara")
                .setLastname("Kawaii")
                .build();

//        Person lara = new Person();
//        lara.setId(1);
//        lara.setLastname("Kawaii");
//        lara.setName("Lara");
//
//        print(lara.toString());
//
//
//        Person lara2 = new Person();
//        lara2.setId(1);
//        lara2.setLastname("Kawaii");
//        lara2.setName("Lara");
//
//        if (lara.equals(lara2)) {
//            //
//        }
//
//       // if (lara.getId() == lara2.getId() && lara.getName().equals(lara2.getName())) ...
//
//        lara.setName("cono");
    }

    private void print(String s) {
        // print on the screen
    }
}
