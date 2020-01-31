package first;


import javafx.util.Pair;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StatisticCollector {

    public List<Pair<Integer, Long>> getStatistic(Collection<Integer> numbers) {

        return numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .sorted(Comparator.comparingLong(Map.Entry::getValue))
                .map(x -> new Pair<>(x.getKey(), x.getValue()))
                .collect(Collectors.toList());
    }

}
