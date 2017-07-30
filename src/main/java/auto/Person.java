package auto;

import com.google.auto.value.AutoValue;
import  javax.annotation.Nullable;

@AutoValue
public abstract class Person {
    public abstract String getName();

    @Nullable
    public abstract String getLastName();

    public abstract int getId();

    public abstract int getMoney();

    public static Builder builder() {
        return new AutoValue_Person.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setName(String newName);

        public abstract Builder setLastname(String newLastname);

        public abstract Builder setId(int newId);

        public abstract Builder setMoney(int newMoney);

        public abstract Person build();
    }
}
