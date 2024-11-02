package lotto.service;

import lotto.util.InputParser;
import lotto.view.InputView;

import java.util.Set;

public class InputService {
    private final InputView inputView;
    private final InputParser inputParser = new InputParser();

    public InputService(InputView inputView) {
        this.inputView = inputView;
    }

    public int getValidBuyInput() {
        while (true) {
            try {
                String money = inputView.getBuy();
                return inputParser.parseBuy(money);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Set<Integer> getValidWinningNumInput() {
        while (true) {
            try {
                String winningNum = inputView.getWinningNum();
                return inputParser.parseWinningNumbers(winningNum);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
