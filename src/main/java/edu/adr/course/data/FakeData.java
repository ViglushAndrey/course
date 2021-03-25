package edu.adr.course.data;

import edu.adr.course.model.Officers;
import edu.adr.course.model.OfficersRanks;
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
 * @DateTime: 24.03.2021|14:00
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

    public List<Officers> getOfficers() {
        return officers;
    }

    public void setOfficers(List<Officers> officers) {
        this.officers = officers;
    }
}
    