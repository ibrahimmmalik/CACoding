package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    final ClearInputBoundary ClearUseCaseInteractor;

    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        ClearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute(){
        ClearUseCaseInteractor.execute();
    }
}
