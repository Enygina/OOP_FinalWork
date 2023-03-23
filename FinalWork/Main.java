package FinalWork;

import FinalWork.logger.Decorator;
import FinalWork.logger.LoggerTerminal;
import FinalWork.controllers.UserController;
import FinalWork.model.FileOperation;
import FinalWork.model.Repository;
import FinalWork.model.RepositoryFile;
import FinalWork.utils.Validate;
import FinalWork.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation("C:\\Users\\Paul\\Documents\\GeekBrains\\OOP\\FinalWork\\users.txt");
        Repository repository = new Decorator(new RepositoryFile(fileOperation), new LoggerTerminal());
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);


        view.run();
    }
}
