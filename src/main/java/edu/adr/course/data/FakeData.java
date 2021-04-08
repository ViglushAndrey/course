package edu.adr.course.data;

import edu.adr.course.model.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * course.FakeData
 *
 * @Autor: Andrey
 * @DateTime: 8.03.2021|14:00
 * @Version: FakeData: 1.0
 */

@Repository
public class FakeData {

    private List<Officers> officers = new ArrayList<>(

            Arrays.asList(

                    new Officers("1", "Jhon Lenon", LocalDate.of(2000, 10, 1), "Sapper", LocalDate.of(2010, 2, 2), "wefwaefgawfawfdwaf", OfficersRanks.Майор),
                    new Officers("2", "Sergey Viglush", LocalDate.of(1972, 8, 17), "Signalman", LocalDate.of(2005, 6, 10), "wefwaefgawfawegergfegferferffdwaf", OfficersRanks.Майор),
                    new Officers("3", "Jhon Manon", LocalDate.of(1988, 12, 15), "Tankman", LocalDate.of(2010, 12, 25), "wefwgtfgfszvzsv, fgrsdfvsdvsdzv", OfficersRanks.Полковник),
                    new Officers("4", "Alon Mercury", LocalDate.of(1966, 10, 1), "Saper", LocalDate.of(2000, 5, 2), "wefwaefgawfawfdwвацфвцвцвуфвфввфцaf", OfficersRanks.Підполковник)




            )

    );

    private List<Temporary_dislocation> temporaryDislocations = new ArrayList<>(
            Arrays.asList(
                    new Temporary_dislocation( "1", "Полігон", "Чернівці","вулиця Московської Олімпіади, 6"),
                    new Temporary_dislocation( "2", "Полігон", "с. Ропча Сторожинецького району",""),
                    new Temporary_dislocation( "3", "Полігон", "Сторожинець","вулиця Антона Чехова"),
                    new Temporary_dislocation( "4", "Полігон", "Чернівці","вулиця Московської Олімпіади,33")
            )
    );
    private List<Permanent_dislocation> permanentDislocations = new ArrayList<>(
            Arrays.asList(
                    new Permanent_dislocation( "1", "Полігон", "Чернівці","вулиця Московської Олімпіади, 6"),
                    new Permanent_dislocation( "2", "Полігон", "с. Ропча Сторожинецького району",""),
                    new Permanent_dislocation( "3", "Полігон", "Сторожинець","вулиця Антона Чехова"),
                    new Permanent_dislocation( "4", "Полігон", "Чернівці","вулиця Московської Олімпіади,33")
            )
    );

    private List<Obj> obj = new ArrayList<>(
            Arrays.asList(
                    new Obj("1", new ArrayList<>(Arrays.asList("Склади, Командний ценр, Казарма, Гаражі, Караул, КПП, Їдальня")))
            )
    );


    private List<Grenades> grenades = new ArrayList<>(
            Arrays.asList(
                    new Grenades("1","РГТ-27С","термобарическая ручная граната","нету"),
                    new Grenades("2","РГ-14","ручна осколкова граната","15м"),
                    new Grenades("3","РГД-33","ручна осколкова граната","25м"),
                    new Grenades("4","РГ-41","ручна осколкова граната","20м"),
                    new Grenades("5","РГД-5","ручна осколкова граната","25м")
            )
    );
    private List<Pistols> pistols = new ArrayList<>(
            Arrays.asList(
                    new Pistols("1","FN Five-seven","5.7x28",20),
                    new Pistols("2","HK45 Tactical",".45 ACP",10),
                    new Pistols("3","M11","9мм",15),
                    new Pistols("4","Glock 17","9мм",17),
                    new Pistols("5","Roberts Defense",".45 ACP",8)
            )
    );
    private List<SniperRifles> sniperRifles = new ArrayList<>(
            Arrays.asList(
                    new SniperRifles("1", "КОРД (АСВК)","12,7 мм",5),
                    new SniperRifles("2", "PSG1","7,62×51",5),
                    new SniperRifles("3", "Винторез","9мм",20),
                    new SniperRifles("4", "«Орсис» Т-5000","8,6мм",10),
                    new SniperRifles("5", "Barrett M82","12,7×99мм",10)
            )
    );
    private List<MachinesGuns> machinesGuns = new ArrayList<>(
            Arrays.asList(
                    new MachinesGuns("1","Browning M1918","7,62x63мм",20),
                    new MachinesGuns("2","Bergmann LMG 15","7,9мм",200),
                    new MachinesGuns("3","ČZ 2000","5,56x45мм",30),
                    new MachinesGuns("4","Dror LMG","7,92×57мм",20)
            )
    );
    private List<Automats> automats = new ArrayList<>(
            Arrays.asList(
                    new Automats("1","Tаvоr TАR-21","5,56мм",30),
                    new Automats("2","АК-101","5,56мм",30),
                    new Automats("3","АК-74М","5,45мм",30),
                    new Automats("4","АК-12","5,45мм",96)
            )
    );
    private List<Tanks> tanks = new ArrayList<>(
            Arrays.asList(
                    new Tanks("1","T-84-120 «Ятаган»",48.0,"6ТД-21200 к. с.","багатопаливний дизель",130,"КБМ-2 (гладкожерлова)"),
                    new Tanks("2","Т-64Е",42.7,"850 к.с.","5ТДФЕ",125,"КБА-4"),
                    new Tanks("3","Т-64БВ",42.4,"700 к.с.","5ТДФЕ",125,"2А46М-1"),
                    new Tanks("4","Т-84У «Оплот»",48.0,"850 к.с.","5ТДФМ",125,"КБА-8")

            )
    );
    private List<BMP> bmp = new ArrayList<>(
            Arrays.asList(
                    new BMP("1","БМП-2",10,"30-мм 2А42 нарезная малокалиберная автоматическая пушка","15т."),
                    new BMP("2","Мардер (БМП)",10,"1 × 20-мм Mk20 DM5 Rh202 нарезная, автоматическая пушка","30т."),
                    new BMP("3","Пума (БМП)",9,"30-мм МК 30-2/АВМ нарезная, автоматическая пушка","43т."),
                    new BMP("4","Strf 90",11,"40-мм «Бофорс» L70 нарезная, автоматическая пушка","29т.")
            )
    );
    private List<BTR> btr = new ArrayList<>(
            Arrays.asList(
                    new BTR("1","EFV",20,"Плавающий бронетранспортёр", "1 x 30-мм пушка MK44 Bushmaster II","35т."),
                    new BTR("2","БТР-50П",22,"Бронетранспортёр", "1 × 7,62-мм пулемёт СГМБ (позже ПКМБ)","14т."),
                    new BTR("3","БТР Фухс",12,"Бронетранспортёр", "Три 7,62-мм MG-3","18т."),
                    new BTR("4","Ахзарит",10,"Тяжёлый гусеничный бронетранспортёр", "пулеметы 4 × 7,62-мм","44т.")
            )
    );

    private List<MilitaryEquipment> militaryEquipments = new ArrayList<>(
            Arrays.asList(
                    new MilitaryEquipment("1", tanks.get(0), 5, bmp.get(2), 6, btr.get(1), 4, 15),
                    new MilitaryEquipment("2", tanks.get(2), 10, bmp.get(0), 3, btr.get(2), 7, 20),
                    new MilitaryEquipment("3", tanks.get(1), 7, bmp.get(3), 6, btr.get(3), 2, 15),
                    new MilitaryEquipment("4", tanks.get(3), 4, bmp.get(1), 9, btr.get(0), 6, 19)
            )
    );
    private List<FreightCar> freightCars = new ArrayList<>(
            Arrays.asList(
                    new FreightCar("1", "ГАЗ-66", "Вантажний автомобіль підвищеної прохідності з колісною формулою 4х4", 3.5, "2т.", 90),
                    new FreightCar("2", "ЗІЛ-131", "Вантажний автомобіль з колісною формулою 6х6", 6.4, "5т.", 80),
                    new FreightCar("3", "Урал-4320", "вантажний автомобіль підвищеної прохідності подвійного призначення з колісною формулою 6х6", 8.4, "12т.", 85)
            )
    );
    private List<Tractor> tractors = new ArrayList<>(
            Arrays.asList(
                    new Tractor("1", "МАЗ-537", 21.6, 55, "90т.", "Седельно-сцепное устройство под шкворень 100 мм"),
                    new Tractor("2", "КрАЗ-7634", 41, 25, "27т.", "Тяжёлый специальный четырехосный бескапотный автомобиль-шасси повышенной проходимости с компоновочной схемой «кабина перед двигателем», монтажной длиной рамы 8080 мм"),
                    new Tractor("3", "МАЗ-7410", 39.9, 65, "22.2т.", "Полноприводный четырёхосный (8х8) тяжёлый колёсный грузовой автомобиль")
            )
    );



    private List<TransportEquipment> transportEquipments = new ArrayList<>(
            Arrays.asList(
                    new TransportEquipment("1", freightCars.get(1), 3, tractors.get(0), 5, 8),
                    new TransportEquipment("2", freightCars.get(0), 5, tractors.get(2), 4, 9),
                    new TransportEquipment("3", freightCars.get(2), 2, tractors.get(1), 3, 5)
            )
    );



    private List<Armament> armament = new ArrayList<>(
            Arrays.asList(
                    new Armament("1", grenades.get(4),pistols.get(1),sniperRifles.get(2),machinesGuns.get(1),automats.get(0),militaryEquipments.get(0),transportEquipments.get(1)),
                    new Armament("2", grenades.get(3),pistols.get(2),sniperRifles.get(3),machinesGuns.get(0),automats.get(2),militaryEquipments.get(1),transportEquipments.get(2)),
                    new Armament("3", grenades.get(2),pistols.get(0),sniperRifles.get(0),machinesGuns.get(2),automats.get(3),militaryEquipments.get(2),transportEquipments.get(0))
            )
    );

    private  List<Serguants> serguants = new ArrayList<>(
            Arrays.asList(
                    new Serguants("1", "Jhon Logon", LocalDate.of(1990, 10, 1), "Sapper", LocalDate.of(2010, 5, 2), "wefwaefgawfawfdwaf", SerguantsRanks.Сержант),
                    new Serguants("2", "Markus Korol", LocalDate.of(1980, 5, 12), "Tankman", LocalDate.of(2012, 10, 5), "wefwaefgawfawfdwafwdfwfwfafa", SerguantsRanks.ГоловнийСержант),
                    new Serguants("3", "Lana Maring", LocalDate.of(1990, 8, 1), "Signalman", LocalDate.of(2009, 9, 30), "wefwaefgawfawfdwafwafwfwfwafwafwafwa", SerguantsRanks.СтаршийСержант)
            )
    );

    private  List<Ordinarys> ordinarys = new ArrayList<>(
            Arrays.asList(
                    new Ordinarys("1", "Andrey Orcus", LocalDate.of(2001, 12, 12), "Sniper", LocalDate.of(2020, 5, 2), "wefwaefgawfawfdwafwafawfwaf", OrdinaryRanks.Солдат),
                    new Ordinarys("2", "Maks Vinlas", LocalDate.of(1998, 5, 1), "Sapper", LocalDate.of(2020, 10, 1), "wefwaefgawfawfdwafwfafwfwafwafwaf", OrdinaryRanks.СтаршийСолдат),
                    new Ordinarys("3", "Aaron Anstey", LocalDate.of(1999, 2, 5), "Sapper", LocalDate.of(2020, 3, 22), "wefwaefgawfawfdwafwfafwfwafwafwaf", OrdinaryRanks.Солдат),
                    new Ordinarys("4", "Alwin Baiss", LocalDate.of(1990, 9, 3), "Sapper", LocalDate.of(2018, 1, 20), "wefwaefgawfawfdwafwfafwfwafwafwaf", OrdinaryRanks.СтаршийСолдат),
                    new Ordinarys("5", "Maks Ball", LocalDate.of(1998, 12, 1), "Sapper", LocalDate.of(2020, 6, 6), "wefwaefgawfawfdwafwfafwfwafwafwaf", OrdinaryRanks.Солдат),
                    new Ordinarys("6", "Maks Clowney", LocalDate.of(1989, 11, 18), "Sapper", LocalDate.of(2017, 4, 24), "wefwaefgawfawfdwafwfafwfwafwafwaf", OrdinaryRanks.СтаршийСолдат),
                    new Ordinarys("7", "Elizabeth Crofford", LocalDate.of(2000, 12, 22), "Sapper", LocalDate.of(2020, 6, 30), "wefwaefgawfawfdwafwfafwfwafwafwaf", OrdinaryRanks.СтаршийСолдат),
                    new Ordinarys("8", "Erik Catchpole", LocalDate.of(1995, 10, 1), "Sapper", LocalDate.of(2020, 9, 9), "wefwaefgawfawfdwafwfafwfwafwafwaf", OrdinaryRanks.Солдат),
                    new Ordinarys("9", "Dominic Gerard", LocalDate.of(1997, 7, 7), "Sapper", LocalDate.of(2020, 8, 4), "wefwaefgawfawfdwafwfafwfwafwafwaf", OrdinaryRanks.СтаршийСолдат)
            )
    );

    private  List<Viddilenia> viddilenias = new ArrayList<>(
            Arrays.asList(
                    new Viddilenia("1","15 Механізоване відділення", 9, ordinarys.get(0), obj.get(0), permanentDislocations.get(1), temporaryDislocations.get(2)),
                    new Viddilenia("2","22 Механізоване відділення", 10, ordinarys.get(1), obj.get(0), permanentDislocations.get(0), temporaryDislocations.get(0)),
                    new Viddilenia("3","105 Механізоване відділення", 12, ordinarys.get(2), obj.get(0), permanentDislocations.get(2), temporaryDislocations.get(3)),
                    new Viddilenia("4","98 Механізоване відділення", 8, ordinarys.get(8), obj.get(0), permanentDislocations.get(0), temporaryDislocations.get(0)),
                    new Viddilenia("5","505 Механізоване відділення", 7, ordinarys.get(5), obj.get(0), permanentDislocations.get(2), temporaryDislocations.get(3)),
                    new Viddilenia("6","33 Механізоване відділення", 9, ordinarys.get(6), obj.get(0), permanentDislocations.get(1), temporaryDislocations.get(1)),
                    new Viddilenia("7","01 Механізоване відділення", 11, ordinarys.get(4), obj.get(0), permanentDislocations.get(0), temporaryDislocations.get(2)),
                    new Viddilenia("8","25 Механізоване відділення", 12, ordinarys.get(3), obj.get(0), permanentDislocations.get(2), temporaryDislocations.get(1)),
                    new Viddilenia("9","80 Механізоване відділення", 10, ordinarys.get(7), obj.get(0), permanentDislocations.get(2), temporaryDislocations.get(3))

            )
    );

    private  List<Vzvods> vzvods = new ArrayList<>(
            Arrays.asList(
                    new Vzvods("1","15 Піхотний взвод", 29, new ArrayList<>(Arrays.asList(viddilenias.get(0), viddilenias.get(1), viddilenias.get(2))), armament.get(0), serguants.get(2), obj.get(0), permanentDislocations.get(1), temporaryDislocations.get(0)),
                    new Vzvods("2","12 Танковий взвод", 18, new ArrayList<>(Arrays.asList(viddilenias.get(3), viddilenias.get(4), viddilenias.get(5))), armament.get(2), serguants.get(1), obj.get(0), permanentDislocations.get(2), temporaryDislocations.get(1)),
                    new Vzvods("3","11 Розвідувальний взвод", 20, new ArrayList<>(Arrays.asList(viddilenias.get(6), viddilenias.get(7), viddilenias.get(8))), armament.get(1), serguants.get(0), obj.get(0), permanentDislocations.get(0), temporaryDislocations.get(2))

            )
    );

    private  List<Rota> rota = new ArrayList<>(

            Arrays.asList(
                    new Rota("1","50 Танковая рота", 80, new ArrayList<>(Arrays.asList(vzvods.get(0), vzvods.get(2), vzvods.get(1))), armament.get(0), officers.get(1), obj.get(0), permanentDislocations.get(0), temporaryDislocations.get(1))
            )

    );

    public List<Officers> getOfficers() {
        return officers;
    }

    public void setOfficers(List<Officers> officers) {
        this.officers = officers;
    }

    public List<Temporary_dislocation> getTemporaryDislocations() {
        return temporaryDislocations;
    }

    public void setTemporaryDislocations(List<Temporary_dislocation> temporaryDislocations) {
        this.temporaryDislocations = temporaryDislocations;
    }

    public List<Permanent_dislocation> getPermanentDislocations() {
        return permanentDislocations;
    }

    public void setPermanentDislocations(List<Permanent_dislocation> permanentDislocations) {
        this.permanentDislocations = permanentDislocations;
    }

    public List<Obj> getObj() {
        return obj;
    }

    public void setObj(List<Obj> obj) {
        this.obj = obj;
    }

    public List<Grenades> getGrenades() {
        return grenades;
    }

    public void setGrenades(List<Grenades> grenades) {
        this.grenades = grenades;
    }

    public List<Pistols> getPistols() {
        return pistols;
    }

    public void setPistols(List<Pistols> pistols) {
        this.pistols = pistols;
    }

    public List<SniperRifles> getSniperRifles() {
        return sniperRifles;
    }

    public void setSniperRifles(List<SniperRifles> sniperRifles) {
        this.sniperRifles = sniperRifles;
    }

    public List<MachinesGuns> getMachinesGuns() {
        return machinesGuns;
    }

    public void setMachinesGuns(List<MachinesGuns> machinesGuns) {
        this.machinesGuns = machinesGuns;
    }

    public List<Automats> getAutomats() {
        return automats;
    }

    public void setAutomats(List<Automats> automats) {
        this.automats = automats;
    }

    public List<Tanks> getTanks() {
        return tanks;
    }

    public void setTanks(List<Tanks> tanks) {
        this.tanks = tanks;
    }

    public List<BMP> getBmp() {
        return bmp;
    }

    public void setBmp(List<BMP> bmp) {
        this.bmp = bmp;
    }

    public List<BTR> getBtr() {
        return btr;
    }

    public void setBtr(List<BTR> btr) {
        this.btr = btr;
    }

    public List<MilitaryEquipment> getMilitaryEquipments() {
        return militaryEquipments;
    }

    public void setMilitaryEquipments(List<MilitaryEquipment> militaryEquipments) {
        this.militaryEquipments = militaryEquipments;
    }

    public List<FreightCar> getFreightCars() {
        return freightCars;
    }

    public void setFreightCars(List<FreightCar> freightCars) {
        this.freightCars = freightCars;
    }

    public List<Tractor> getTractors() {
        return tractors;
    }

    public void setTractors(List<Tractor> tractors) {
        this.tractors = tractors;
    }

    public List<TransportEquipment> getTransportEquipments() {
        return transportEquipments;
    }

    public void setTransportEquipments(List<TransportEquipment> transportEquipments) {
        this.transportEquipments = transportEquipments;
    }

    public List<Armament> getArmament() {
        return armament;
    }

    public void setArmament(List<Armament> armament) {
        this.armament = armament;
    }

    public List<Vzvods> getVzvods() {
        return vzvods;
    }

    public void setVzvods(List<Vzvods> vzvods) {
        this.vzvods = vzvods;
    }

    public List<Rota> getRota() {
        return rota;
    }

    public void setRota(List<Rota> rota) {
        this.rota = rota;
    }

    public List<Serguants> getSerguants() {
        return serguants;
    }

    public void setSerguants(List<Serguants> serguants) {
        this.serguants = serguants;
    }

    public List<Ordinarys> getOrdinarys() {
        return ordinarys;
    }

    public void setOrdinarys(List<Ordinarys> ordinarys) {
        this.ordinarys = ordinarys;
    }

    public List<Viddilenia> getViddilenias() {
        return viddilenias;
    }

    public void setViddilenias(List<Viddilenia> viddilenias) {
        this.viddilenias = viddilenias;
    }
}
    