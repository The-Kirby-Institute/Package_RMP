package test;

import java.io.IOException;
import sim.Simulation_Remote_MetaPopulation;

public class Test_Population_Remote_MetaPopulation_Sim {

    public static void main(String[] arg) throws IOException, InterruptedException, ClassNotFoundException {
        String[] baseDir = new String[]{
            //"C:\\Users\\Bhui\\OneDrive - UNSW\\RMP\\Syp_BestFit_050_Non_Key",            
            //"Syp_Sel_FC_CM_*",                          
            //"Srn_RPO_*",                       
            "C:\\Users\\Bhui\\OneDrive - UNSW\\RMP\\Test",
            "Opt_NGCTBehav",    
        };

        Simulation_Remote_MetaPopulation.main(baseDir);               
        //Simulation_Remote_MetaPopulation.main(new String[]{"C:\\Users\\Bhui\\OneDrive - UNSW\\RMP\\Syp_BestFit_050_Non_Key","Syp_Sel_FC_CM_*"});
    }

}
