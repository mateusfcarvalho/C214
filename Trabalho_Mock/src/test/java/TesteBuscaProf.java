
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProf {

    ProfService service;
    BuscaProf buscaProf;

    @Before
    public void setup(){
        //Criando o contexo do meu teste com o Mock (serviço mock)
        service = new MockProfService();
        buscaProf = new BuscaProf(service);
    }

    /*
    public static String PROFESSOR_FILOSOFIA =
            "{ \"nome_do_professor\": \"Raimundo\", \n " +
                    "\"horario_de_atendimento\": \"10:00\", \n " +
                    "\"periodo\": \"Integral\" }";

    public static String  PROFESSOR_PADRAO=
            "{ \"nome_do_professor\": \"Girafales\", \n " +
                    "\"horario_de_atendimento\": \"17:00\", \n " +
                    "\"periodo\": \"Integral\" }";

    public static String PROFESSOR_FISICA =
            "{ \"nome_do_professor\": \"Stephen\", \n " +
                    "\"horario_de_atendimento\": \"20:18\", \n " +
                    "\"periodo\": \"Integral\" }";

    public static String PROFESSOR_QUIMICA =
            "{ \"nome_do_professor\": \"Marie Curie\", \n " +
                    "\"horario_de_atendimento\": \"19:11\", \n " +
                    "\"periodo\": \"Integral\" }";                  

    public static String INEXISTENTE =
            "{ \"nome_do_professor\": \"Inesistente\", \n " +
                    "\"horario_de_atendimento\": \"Inesistente\", \n " +
                    "\"periodo\": \"Inesistente\" }"; 

    */  

    @Test
    public void testeBuscaProfFisica(){

        //Fiz a busca
        Professor PROFESSOR_FISICA = buscaProf.buscaProf(20);

        //Faz assertion
        assertEquals("Stephen", PROFESSOR_FISICA.getNome_do_professor());
        assertEquals("20:18", PROFESSOR_FISICA.getHorario_de_atendimento());
        assertEquals("Integral", PROFESSOR_FISICA.getPeriodo());

    }

   @Test
    public void testeBuscaProfFilosofia(){

        //Fiz a busca
        Professor PROFESSOR_FILOSOFIA = buscaProf.buscaProf(10);

        //Faz assertion
        assertEquals("Raimundo", PROFESSOR_FILOSOFIA.getNome_do_professor());
        assertEquals("10:00", PROFESSOR_FILOSOFIA.getHorario_de_atendimento());
        assertEquals("Integral", PROFESSOR_FILOSOFIA.getPeriodo());

    }

    @Test
    public void testeBuscaProfQuimica(){

        //Fiz a busca
        Professor PROFESSOR_QUIMICA = buscaProf.buscaProf(26);

        //Faz assertion
        assertEquals("Marie Curie", PROFESSOR_QUIMICA.getNome_do_professor());
        assertEquals("19:11", PROFESSOR_QUIMICA.getHorario_de_atendimento());
        assertEquals("Integral", PROFESSOR_QUIMICA.getPeriodo());

    }

    @Test
    public void testeBuscaProfPadrao(){

        //Fiz a busca
        Professor PROFESSOR_PADRAO = buscaProf.buscaProf(10);

        //Faz assertion
        assertEquals("Girafales", PROFESSOR_PADRAO.getNome_do_professor());
        assertEquals("17:00", PROFESSOR_PADRAO.getHorario_de_atendimento());
        assertEquals("Integral", PROFESSOR_PADRAO.getPeriodo());

    }

    @Test
    public void testeBuscaProfValido(){

        //Faz a busca de um inimigo válido (id = 10 ou id = 20 ou ID positivo)
        boolean ProfValido = buscaProf.verificaArrayListExistente(10);

        assertTrue(ProfValido);
    }

    @Test
    public void testeBuscaProfInValido(){

        //Faz a busca de um inimigo inválido (id negativo)
        boolean ProfValido = buscaProf.verificaArrayListExistente(-8);

        assertFalse(ProfValido);
    }
}
