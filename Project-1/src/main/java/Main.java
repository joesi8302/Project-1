import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;



public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH); //This helps us set up HTML files in our resource location
        }).start(9000);

        app.post("/form-add", context -> {
            int num1 = Integer.parseInt(context.formParam("add"));
            int num2 = Integer.parseInt(context.formParam("add2"));

            context.result(String.valueOf((num1+num2)));
        });

        app.post("/form-subtract", context -> {
            int num1 = Integer.parseInt(context.formParam("subtract"));
            int num2 = Integer.parseInt(context.formParam("subtract2"));

            context.result(String.valueOf((num1-num2)));
        });

        app.post("/form-multiply", context -> {
            int num1 = Integer.parseInt(context.formParam("multiply"));
            int num2 = Integer.parseInt(context.formParam("multiply2"));

            context.result(String.valueOf((num1*num2)));
        });

        app.post("/form-divide", context -> {
            int num1 = Integer.parseInt(context.formParam("divide"));
            int num2 = Integer.parseInt(context.formParam("divide2"));

            context.result(String.valueOf((num1/num2)));
        });



    }
}
