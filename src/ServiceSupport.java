public class ServiceSupport extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equals("ru")) {
            System.out.println("Выберите услугу: \n1. Баланс\n2. Поддержка\n3. Настройки");
        } else if (request.equals("kz")) {
            System.out.println("Қызметті таңдаңыз: \n1. Баланс\n2. Қолдау\n3. Баптаулар");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}