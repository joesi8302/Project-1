import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;



public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH); //This helps us set up HTML files in our resource location
        }).start(9000);

        app.post("/form-add", context -> {
            double num1 = Double.parseDouble(context.formParam("add"));
            double num2 = Double.parseDouble(context.formParam("add2"));

            context.result(String.valueOf((num1+num2)));
        });

        app.post("/form-subtract", context -> {
            double num1 = Double.parseDouble(context.formParam("subtract"));
            double num2 = Double.parseDouble(context.formParam("subtract2"));

            context.result(String.valueOf((num1-num2)));
        });

        app.post("/form-multiply", context -> {
            double num1 = Double.parseDouble(context.formParam("multiply"));
            double num2 = Double.parseDouble(context.formParam("multiply2"));

            context.result(String.valueOf((num1*num2)));
        });

        app.post("/form-divide", context -> {
            double num1 = Double.parseDouble(context.formParam("divide"));
            double num2 = Double.parseDouble(context.formParam("divide2"));

            context.result(String.valueOf((num1/num2)));
        });



    }
}
