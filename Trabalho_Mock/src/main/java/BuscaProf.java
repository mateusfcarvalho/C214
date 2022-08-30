import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProf {

    ProfService ProfService;

    public BuscaProf(ProfService service){
        this.ProfService = service;
    }

    public Professor buscaProf(int id){
        // id = 10 -> buscando um inimigo de ID 10
        //InimigoJson é uma string que retornou do serviço
        String ProfJson = ProfService.busca(id);

        //jsonObject é um objeto JSON feito a partir da string de retonro
        JsonObject jsonObject = JsonParser.parseString(ProfJson).getAsJsonObject();

        return new Professor(jsonObject.get("nome_do_professor").getAsString(),
                jsonObject.get("horario_de_atendimento").getAsString(),
                jsonObject.get("periodo").getAsString());
                
    }

    public boolean verificaArrayListExistente(int id){
        boolean ProfExistente = ProfService.ProfExistente(id);

        if (ProfExistente){
            return true;
        }else{
            return false;
        }
    }

}
