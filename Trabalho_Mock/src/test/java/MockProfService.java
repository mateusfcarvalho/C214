

import java.util.ArrayList;

public class MockProfService implements ProfService {


    @Override
    public String busca(int id) {

        if (id == 10){
            return ProfConst.PROFESSOR_FILOSOFIA;
        }else if (id == 20){
            return ProfConst.PROFESSOR_FISICA;
        }else if(id > 20){
            return ProfConst.PROFESSOR_QUIMICA;
        }else if(id < 0){
            return ProfConst.INEXISTENTE;
        }else{
            return ProfConst.PADRAO;
        }


    }

    @Override
    public boolean ProfExistente(int id) {
        //Aceitando somente IDs 10 e 20. Pode-se melhorar a logica para aceitar também IDs positivos
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(id) || list.get(i).equals(id)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}
