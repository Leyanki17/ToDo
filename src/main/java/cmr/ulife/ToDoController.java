package cmr.ulife;

import io.micronaut.http.annotation.*;

@Controller("/toDo")
public class ToDoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}