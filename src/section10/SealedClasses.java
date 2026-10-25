package section10;

sealed class Human permits Creator, Entreprenuer, Cricketer {}

final class Entreprenuer extends Human {}

non-sealed class Creator extends Human {}

sealed class Cricketer extends Human permits Batsman, Bowler {}

class FBCreator extends Creator {}

//class FMCGEntreprenuer extends Entreprenuer {}

final class Batsman extends Cricketer {}

final class Bowler extends Cricketer {}

public class SealedClasses {
}
