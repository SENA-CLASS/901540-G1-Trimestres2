/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.app;

import edu.co.sena.generalizacion1.AguilaHembra;
import edu.co.sena.generalizacion1.AguilaMacho;
import edu.co.sena.generalizacion1.AlmejaHembra;
import edu.co.sena.generalizacion1.AlmejaMacho;
import edu.co.sena.generalizacion1.AtunHembra;
import edu.co.sena.generalizacion1.AtunMacho;
import edu.co.sena.generalizacion1.AvestruzHembra;
import edu.co.sena.generalizacion1.AvestruzMacho;
import edu.co.sena.generalizacion1.CalamarHembra;
import edu.co.sena.generalizacion1.CalamarMacho;
import edu.co.sena.generalizacion1.CangrejoHembra;
import edu.co.sena.generalizacion1.CangrejoMacho;
import edu.co.sena.generalizacion1.CestodosHembra;
import edu.co.sena.generalizacion1.CocodriloHembra;
import edu.co.sena.generalizacion1.CocodriloMacho;
import edu.co.sena.generalizacion1.DemosponjasHembra;
import edu.co.sena.generalizacion1.Hombre;
import edu.co.sena.generalizacion1.HormigaHembra;
import edu.co.sena.generalizacion1.HormigaMacho;
import edu.co.sena.generalizacion1.LeonHembra;
import edu.co.sena.generalizacion1.LeonMacho;
import edu.co.sena.generalizacion1.LombrizHembra;
import edu.co.sena.generalizacion1.Mujer;
import edu.co.sena.generalizacion1.OrnitorringoHembra;
import edu.co.sena.generalizacion1.OrnitorringoMacho;
import edu.co.sena.generalizacion1.Perro;
import edu.co.sena.generalizacion1.PerroHembra;
import edu.co.sena.generalizacion1.PerroMacho;
import edu.co.sena.generalizacion1.SalamandraHembra;
import edu.co.sena.generalizacion1.SalamandraMacho;
import edu.co.sena.generalizacion1.SapoHembra;
import edu.co.sena.generalizacion1.SapoMacho;
import edu.co.sena.generalizacion1.SerpienteHembra;
import edu.co.sena.generalizacion1.SerpienteMacho;
import edu.co.sena.generalizacion1.TiburonHembra;
import edu.co.sena.generalizacion1.TiburonMacho;
import edu.co.sena.generalizacion1.TortugaHembra;
import edu.co.sena.generalizacion1.TortugaMacho;

/**
 *
 * @author duvan
 */
public class AnimalesAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AguilaMacho aguila1 = new AguilaMacho();

        System.out.println("Aguila Macho: ");

        aguila1.comer();
        aguila1.desplazarse();
        aguila1.nacer();
        aguila1.reproducirse();
        aguila1.morir();
        aguila1.respirar();

        System.out.println("------------------------------------------------------------------------------------");

        AguilaHembra aguila2 = new AguilaHembra();

        System.out.println("Aguila Hembra: ");

        aguila2.comer();
        aguila2.criar();
        aguila2.desplazarse();
        aguila2.nacer();
        aguila2.reproducirse();
        aguila2.morir();
        aguila2.respirar();

        System.out.println("------------------------------------------------------------------------------------");

        AtunMacho atun1 = new AtunMacho();

        System.out.println("Atun Macho");

        atun1.comer();
        atun1.desplazarse();
        atun1.nacer();
        atun1.reproducirse();
        atun1.respirar();
        atun1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        AtunHembra atun2 = new AtunHembra();

        System.out.println("Atun Hembra");

        atun2.comer();
        atun2.criar();
        atun2.desplazarse();
        atun2.nacer();
        atun2.reproducirse();
        atun2.respirar();
        atun2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        AvestruzMacho avestruz1 = new AvestruzMacho();

        System.out.println("Avestruz Macho");

        avestruz1.comer();
        avestruz1.desplazarse();
        avestruz1.nacer();
        avestruz1.reproducirse();
        avestruz1.respirar();
        avestruz1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        AvestruzHembra avestruz2 = new AvestruzHembra();

        System.out.println("Avestruz Hembra");

        avestruz2.comer();
        avestruz2.desplazarse();
        avestruz2.nacer();
        avestruz2.reproducirse();
        avestruz2.criar();
        avestruz2.respirar();
        avestruz2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        CocodriloMacho cocodrilo1 = new CocodriloMacho();

        System.out.println("Cocodrilo Macho");

        cocodrilo1.comer();
        cocodrilo1.desplazarse();
        cocodrilo1.nacer();
        cocodrilo1.reproducirse();
        cocodrilo1.respirar();
        cocodrilo1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        CocodriloHembra cocodrilo2 = new CocodriloHembra();

        System.out.println("Cocodrilo Hembra");

        cocodrilo2.comer();
        cocodrilo2.desplazarse();
        cocodrilo2.nacer();
        cocodrilo2.reproducirse();
        cocodrilo2.criar();
        cocodrilo2.respirar();
        cocodrilo2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        Hombre hombre1 = new Hombre();

        System.out.println("Humano Hombre");

        hombre1.comer();
        hombre1.desplazarse();
        hombre1.nacer();
        hombre1.reproducirse();
        hombre1.respirar();
        hombre1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        Mujer hombre2 = new Mujer();

        System.out.println("Humano Mujer");

        hombre2.comer();
        hombre2.desplazarse();
        hombre2.nacer();
        hombre2.reproducirse();
        hombre2.respirar();
        hombre2.criar();
        hombre2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        OrnitorringoMacho ornitorrinco1 = new OrnitorringoMacho();

        System.out.println("Ornitorringo Macho");

        ornitorrinco1.comer();
        ornitorrinco1.desplazarse();
        ornitorrinco1.nacer();
        ornitorrinco1.reproducirse();
        ornitorrinco1.respirar();
        ornitorrinco1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        OrnitorringoHembra ornitorrinco2 = new OrnitorringoHembra();

        System.out.println("Ornitorringo Hembra");

        ornitorrinco2.comer();
        ornitorrinco2.desplazarse();
        ornitorrinco2.nacer();
        ornitorrinco2.reproducirse();
        ornitorrinco2.criar();
        ornitorrinco2.respirar();
        ornitorrinco2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        PerroMacho perro1 = new PerroMacho();

        System.out.println("Perro Macho");

        perro1.setRaza("Labrador");
        perro1.comer();
        perro1.desplazarse();
        perro1.nacer();
        perro1.reproducirse();
        perro1.respirar();
        System.out.println("La raza del perro es: " + perro1.getRaza());
        System.out.println("El perro tiene " + Perro.PATAS + " patas.");
        perro1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        PerroHembra perro2 = new PerroHembra();

        System.out.println("Perro Hembra");

        perro2.setRaza("Beagle");
        perro2.comer();
        perro2.desplazarse();
        perro2.nacer();
        perro2.reproducirse();
        perro1.respirar();
        perro2.criar();
        System.out.println("La raza de la perra es: " + perro2.getRaza());
        System.out.println("La perra tiene " + Perro.PATAS + " patas.");
        perro2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        SalamandraMacho salamandra1 = new SalamandraMacho();

        System.out.println("Salamandra Macho");

        salamandra1.comer();
        salamandra1.desplazarse();
        salamandra1.nacer();
        salamandra1.reproducirse();
        salamandra1.respirar();
        salamandra1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        SalamandraHembra salamandra2 = new SalamandraHembra();

        System.out.println("Salamandra Hembra");

        salamandra2.comer();
        salamandra2.desplazarse();
        salamandra2.nacer();
        salamandra2.reproducirse();
        salamandra2.respirar();
        salamandra2.criar();
        salamandra2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        SapoMacho sapo1 = new SapoMacho();

        System.out.println("Sapo Macho");

        sapo1.comer();
        sapo1.desplazarse();
        sapo1.nacer();
        sapo1.reproducirse();
        sapo1.respirar();
        sapo1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        SapoHembra sapo2 = new SapoHembra();

        System.out.println("Sapo Hembra");

        sapo2.comer();
        sapo2.desplazarse();
        sapo2.nacer();
        sapo2.reproducirse();
        sapo2.respirar();
        sapo2.criar();
        sapo2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        TiburonMacho tiburon1 = new TiburonMacho();

        System.out.println("Tiburon Macho");

        tiburon1.comer();
        tiburon1.desplazarse();
        tiburon1.nacer();
        tiburon1.reproducirse();
        tiburon1.respirar();
        tiburon1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        TiburonHembra tiburon2 = new TiburonHembra();

        System.out.println("Tiburon Hembra");

        tiburon2.comer();
        tiburon2.desplazarse();
        tiburon2.nacer();
        tiburon2.reproducirse();
        tiburon2.respirar();
        tiburon2.criar();
        tiburon2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        TortugaMacho tortuga1 = new TortugaMacho();

        System.out.println("Tortuga Macho");

        tortuga1.comer();
        tortuga1.desplazarse();
        tortuga1.nacer();
        tortuga1.reproducirse();
        tortuga1.respirar();
        tortuga1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        TortugaHembra tortuga2 = new TortugaHembra();

        System.out.println("Tortuga Hembra");

        tortuga2.comer();
        tortuga2.desplazarse();
        tortuga2.nacer();
        tortuga2.reproducirse();
        tortuga2.respirar();
        tortuga2.criar();
        tortuga2.morir();

        System.out.println("------------------------------------------------------------------------------------");
        
        LeonMacho simba = new LeonMacho();
        
        System.out.println("Leon Macho");
        
        simba.nacer();
        simba.comer();
        simba.desplazarse();
        simba.reproducirse();
        simba.respirar();
        simba.morir();
        
        System.out.println("------------------------------------------------------------------------------------");
        
        LeonHembra sarafina = new LeonHembra();
        
        System.out.println("leon Hembra");
        
        sarafina.nacer();
        sarafina.criar();
        sarafina.comer();
        sarafina.desplazarse();
        sarafina.reproducirse();
        sarafina.respirar();
        sarafina.morir();
        
        System.out.println("------------------------------------------------------------------------------------");
        
        SerpienteMacho serpiente = new SerpienteMacho();
        
        System.out.println("Serpiente Macho");
        
        serpiente.nacer();
        serpiente.comer();
        serpiente.desplazarse();
        serpiente.reproducirse();
        serpiente.respirar();
        serpiente.morir();
        
        System.out.println("------------------------------------------------------------------------------------");
        
        SerpienteHembra serpiente1 = new SerpienteHembra();
        
        System.out.println("Serpiente Hembra");
        
        serpiente1.nacer();
        serpiente1.criar();
        serpiente1.comer();
        serpiente1.desplazarse();
        serpiente1.reproducirse();
        serpiente1.respirar();
        serpiente1.morir();
        
        System.out.println("------------------------------------------------------------------------------------");

        HormigaMacho hormiga1 = new HormigaMacho();

        System.out.println("Hormiga Macho");

        hormiga1.comer();
        hormiga1.desplazarse();
        hormiga1.nacer();
        hormiga1.reproducirse();
        hormiga1.respirar();
        hormiga1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        HormigaHembra hormiga2 = new HormigaHembra();

        System.out.println("Hormiga Hembra o Reina");

        hormiga2.nacer();
        hormiga2.criar();
        hormiga2.desplazarse();
        hormiga2.comer();
        hormiga2.reproducirse();
        hormiga2.respirar();
        hormiga2.morir();

        System.out.println("------------------------------------------------------------------------------------");

        CangrejoMacho doncangrejo = new CangrejoMacho();

        System.out.println("Cangrejo Macho");

        doncangrejo.nacer();
        doncangrejo.comer();
        doncangrejo.desplazarse();
        doncangrejo.reproducirse();
        doncangrejo.respirar();
        doncangrejo.morir();

        System.out.println("------------------------------------------------------------------------------------");

        CangrejoHembra cangreja = new CangrejoHembra();

        System.out.println("Cangrejo Hembra");

        cangreja.nacer();
        cangreja.criar();
        cangreja.comer();
        cangreja.desplazarse();
        cangreja.reproducirse();
        cangreja.respirar();
        cangreja.morir();

        System.out.println("------------------------------------------------------------------------------------");

        LombrizHembra lombriz = new LombrizHembra();

        System.out.println("Lombriz Hermafrodita");

        lombriz.nacer();
        lombriz.criar();
        lombriz.comer();
        lombriz.desplazarse();
        lombriz.reproducirse();
        lombriz.respirar();
        lombriz.morir();

        System.out.println("------------------------------------------------------------------------------------");

        AlmejaMacho almeja = new AlmejaMacho();

        System.out.println("Almeja Macho");

        almeja.nacer();
        almeja.comer();
        almeja.desplazarse();
        almeja.reproducirse();
        almeja.respirar();
        almeja.morir();

        System.out.println("------------------------------------------------------------------------------------");

        AlmejaHembra almeja1 = new AlmejaHembra();

        System.out.println("Almeja Hembra");

        almeja1.nacer();
        almeja1.criar();
        almeja1.comer();
        almeja1.desplazarse();
        almeja1.reproducirse();
        almeja1.respirar();
        almeja1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        CalamarMacho calamardo = new CalamarMacho();

        System.out.println("Calamar Macho");

        calamardo.nacer();
        calamardo.comer();
        calamardo.desplazarse();
        calamardo.reproducirse();
        calamardo.respirar();
        calamardo.morir();

        System.out.println("------------------------------------------------------------------------------------");

        CalamarHembra calamardo1 = new CalamarHembra();

        System.out.println("Calamar Hembra");

        calamardo1.nacer();
        calamardo1.criar();
        calamardo1.comer();
        calamardo1.desplazarse();
        calamardo1.reproducirse();
        calamardo1.respirar();
        calamardo1.morir();

        System.out.println("------------------------------------------------------------------------------------");

        CestodosHembra cestodos = new CestodosHembra();

        System.out.println("Cestodos Hermafrodita");

        cestodos.nacer();
        cestodos.criar();
        cestodos.comer();
        cestodos.desplazarse();
        cestodos.reproducirse();
        cestodos.respirar();
        cestodos.morir();

        System.out.println("------------------------------------------------------------------------------------");

        DemosponjasHembra demosponja = new DemosponjasHembra();

        System.out.println("Demosponjas Hermafrodita");

        demosponja.nacer();
        demosponja.criar();
        demosponja.comer();
        demosponja.desplazarse();
        demosponja.reproducirse();
        demosponja.respirar();
        demosponja.morir();

        System.out.println("------------------------------------------------------------------------------------");

    }

}
