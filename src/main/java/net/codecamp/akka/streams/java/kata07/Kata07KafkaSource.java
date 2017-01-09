package net.codecamp.akka.streams.java.kata07;

import akka.actor.ActorSystem;
import akka.japi.Function;
import akka.japi.Pair;
import akka.kafka.ConsumerMessage;
import akka.kafka.javadsl.Consumer;
import akka.stream.javadsl.Source;
import net.codecamp.akka.streams.java.model.FunResult;

class Kata07KafkaSource {

    final static ActorSystem system = ActorSystem.create("Kata07KafkaSource");

    /**
     * Task: Create a akka.stream.javadsl.Source that
     * reads each record from the Kafka topic named kata07-topic,
     * transforms each record value into a FunResult by passing each record value to the given function fun,
     * emits an <code>akka.japi.Pair<ConsumerMessage.CommittableMessage<String, String>, FunResult></code>
     * and supports explicitly committing the offset of a consumed element to Kafka.
     * Decouple from the call to the given function by defining an asynchronous boundary.
     * Pass the ActorSystem {@link Kata07KafkaSource#system} to the consumer settings.
     * Use the string kata07-consumergroup as the groupId in the consumer settings.
     * Make sure that the applied consumer settings also contain the following settings:
     * <ul>
     * <li>ConsumerConfig.AUTO_OFFSET_RESET_CONFIG "earliest"</li>
     * <li>ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG "false"</li>
     * </ul>
     * <p/>
     * Tip: FunResult can be imported from the package called model contained in this project.
     * <p/>
     * Tip: Just create the source, i.e. do not run it e.g. with a sink.
     * <p/>
     * Tip: See kata06 for instructions regarding Kafka.
     * <p/>
     * Tip: To provide consumer settings see: http://doc.akka.io/docs/akka-stream-kafka/0.13/consumer.html#settings
     * <p/>
     * Reference: http://doc.akka.io/docs/akka-stream-kafka/0.13/consumer.html#offset-storage-in-kafka
     * <p/>
     * Check: The kata is solved when the corresponding unit test is green.
     *
     * @return The source.
     */
    static Source<Pair<ConsumerMessage.CommittableMessage<String, String>, FunResult>, Consumer.Control> createKafkaSource(final Function<String, FunResult> fun) {
        return null;
    }

}
