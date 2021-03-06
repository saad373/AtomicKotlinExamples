import org.junit.Test;

public class TestExamples extends AbstractTestExamples {

  @Test
  public void testImplementations() {
    testExample("Examples/Abstract/Implementations.kt", abstractclasses.ImplementationsKt::main);
  }

  @Test
  public void testInterfaceCollision() {
    testExample("Examples/Abstract/InterfaceCollision.kt", collision.InterfaceCollisionKt::main);
  }

  @Test
  public void testStateOfAClass() {
    testExample("Examples/Abstract/StateOfAClass.kt", abstractstate.StateOfAClassKt::main);
  }

  @Test
  public void testWithPropertyAccessor() {
    testExample("Examples/Abstract/WithPropertyAccessor.kt", abstractclasses.WithPropertyAccessorKt::main);
  }

  @Test
  public void testBCIExercise1() {
    testExample("Examples/BaseClassInit/BCIExercise1.kt", baseClassInitializationExercise1.BCIExercise1Kt::main);
  }

  @Test
  public void testBCIExercise2() {
    testExample("Examples/BaseClassInit/BCIExercise2.kt", baseClassInitializationExercise2.BCIExercise2Kt::main);
  }

  @Test
  public void testGreatApe3() {
    testExample("Examples/BaseClassInit/GreatApe3.kt", baseclassinit.GreatApe3Kt::main);
  }

  @Test
  public void testHouse() {
    testExample("Examples/BaseClassInit/House.kt", baseclassinit.HouseKt::main);
  }

  @Test
  public void testOtherConstructors() {
    testExample("Examples/BaseClassInit/OtherConstructors.kt", baseclassinit.OtherConstructorsKt::main);
  }

  @Test
  public void testClosed() {
    testExample("Examples/Booleans/Closed.kt", ClosedKt::main);
  }

  @Test
  public void testEvaluationOrder() {
    testExample("Examples/Booleans/EvaluationOrder.kt", EvaluationOrderKt::main);
  }

  @Test
  public void testOpen1() {
    testExample("Examples/Booleans/Open1.kt", Open1Kt::main);
  }

  @Test
  public void testOpen2() {
    testExample("Examples/Booleans/Open2.kt", Open2Kt::main);
  }

  @Test
  public void testDoWhileControl() {
    testExample("Examples/BreakAndContinue/DoWhileControl.kt", DoWhileControlKt::main);
  }

  @Test
  public void testForControl() {
    testExample("Examples/BreakAndContinue/ForControl.kt", ForControlKt::main);
  }

  @Test
  public void testForLabeled() {
    testExample("Examples/BreakAndContinue/ForLabeled.kt", ForLabeledKt::main);
  }

  @Test
  public void testImproved() {
    testExample("Examples/BreakAndContinue/Improved.kt", ImprovedKt::main);
  }

  @Test
  public void testWhileControl() {
    testExample("Examples/BreakAndContinue/WhileControl.kt", WhileControlKt::main);
  }

  @Test
  public void testWhileLabeled() {
    testExample("Examples/BreakAndContinue/WhileLabeled.kt", WhileLabeledKt::main);
  }

  @Test
  public void testAssociateBy() {
    testExample("Examples/BuildingMaps/AssociateBy.kt", AssociateByKt::main);
  }

  @Test
  public void testAssociateByUnique() {
    testExample("Examples/BuildingMaps/AssociateByUnique.kt", AssociateByUniqueKt::main);
  }

  @Test
  public void testAssociateWith() {
    testExample("Examples/BuildingMaps/AssociateWith.kt", AssociateWithKt::main);
  }

  @Test
  public void testFilterMap() {
    testExample("Examples/BuildingMaps/FilterMap.kt", FilterMapKt::main);
  }

  @Test
  public void testGetOrPut() {
    testExample("Examples/BuildingMaps/GetOrPut.kt", GetOrPutKt::main);
  }

  @Test
  public void testGroupBy() {
    testExample("Examples/BuildingMaps/GroupBy.kt", GroupByKt::main);
  }

  @Test
  public void testGroupByVsFilter() {
    testExample("Examples/BuildingMaps/GroupByVsFilter.kt", GroupByVsFilterKt::main);
  }

  @Test
  public void testSimilarOperation() {
    testExample("Examples/BuildingMaps/SimilarOperation.kt", SimilarOperationKt::main);
  }

  @Test
  public void testTransformingMap() {
    testExample("Examples/BuildingMaps/TransformingMap.kt", TransformingMapKt::main);
  }

  @Test
  public void testCheckInstructionsSoln1() {
    testExample("Examples/CheckInstructions/CheckInstructionsSoln1.kt", checkinstructionssoln1.CheckInstructionsSoln1Kt::main);
  }

  @Test
  public void testCheckInstructionsSoln2() {
    testExample("Examples/CheckInstructions/CheckInstructionsSoln2.kt", checkinstructionssoln2.CheckInstructionsSoln2Kt::main);
  }

  @Test
  public void testCheckInstructionsSoln3() {
    testExample("Examples/CheckInstructions/CheckInstructionsSoln3.kt", checkinstructionssoln3.CheckInstructionsSoln3Kt::main);
  }

  @Test
  public void testCheckInstructionsSoln4() {
    testExample("Examples/CheckInstructions/CheckInstructionsSoln4.kt", checkinstructionssoln4.CheckInstructionsSoln4Kt::main);
  }

  @Test
  public void testDataFile() {
    testExample("Examples/CheckInstructions/DataFile.kt", checkinstructions.DataFileKt::main);
  }

  @Test
  public void testGetTrace() {
    testExample("Examples/CheckInstructions/GetTrace.kt", checkinstructions.GetTraceKt::main);
  }

  @Test
  public void testJulianMonth() {
    testExample("Examples/CheckInstructions/JulianMonth.kt", checkinstructions.JulianMonthKt::main);
  }

  @Test
  public void testPostconditions() {
    testExample("Examples/CheckInstructions/Postconditions.kt", checkinstructions.PostconditionsKt::main);
  }

  @Test
  public void testQuadraticRequire() {
    testExample("Examples/CheckInstructions/QuadraticRequire.kt", checkinstructions.QuadraticRequireKt::main);
  }

  @Test
  public void testRequireNotNull() {
    testExample("Examples/CheckInstructions/RequireNotNull.kt", checkinstructions.RequireNotNullKt::main);
  }

  @Test
  public void testSingleArgRequire() {
    testExample("Examples/CheckInstructions/SingleArgRequire.kt", checkinstructions.SingleArgRequireKt::main);
  }

  @Test
  public void testDelegatedControls() {
    testExample("Examples/ClassDelegation/DelegatedControls.kt", classdelegation.DelegatedControlsKt::main);
  }

  @Test
  public void testExplicitDelegation() {
    testExample("Examples/ClassDelegation/ExplicitDelegation.kt", classdelegation.ExplicitDelegationKt::main);
  }

  @Test
  public void testModelingMI() {
    testExample("Examples/ClassDelegation/ModelingMI.kt", classdelegation.ModelingMIKt::main);
  }

  @Test
  public void testCompanionDelegation() {
    testExample("Examples/CompanionObjects/CompanionDelegation.kt", companionobjects.CompanionDelegationKt::main);
  }

  @Test
  public void testCompanionFactory() {
    testExample("Examples/CompanionObjects/CompanionFactory.kt", companionobjects.CompanionFactoryKt::main);
  }

  @Test
  public void testCompanionInstance() {
    testExample("Examples/CompanionObjects/CompanionInstance.kt", companionobjects.CompanionInstanceKt::main);
  }

  @Test
  public void testCompanionObject() {
    testExample("Examples/CompanionObjects/CompanionObject.kt", CompanionObjectKt::main);
  }

  @Test
  public void testDelegateAndExtend() {
    testExample("Examples/CompanionObjects/DelegateAndExtend.kt", companionobjects.DelegateAndExtendKt::main);
  }

  @Test
  public void testInitialization() {
    testExample("Examples/CompanionObjects/Initialization.kt", companionobjects.InitializationKt::main);
  }

  @Test
  public void testNamingCompanionObjects() {
    testExample("Examples/CompanionObjects/NamingCompanionObjects.kt", NamingCompanionObjectsKt::main);
  }

  @Test
  public void testObjectCounter() {
    testExample("Examples/CompanionObjects/ObjectCounter.kt", ObjectCounterKt::main);
  }

  @Test
  public void testObjectFunctions() {
    testExample("Examples/CompanionObjects/ObjectFunctions.kt", ObjectFunctionsKt::main);
  }

  @Test
  public void testObjectProperty() {
    testExample("Examples/CompanionObjects/ObjectProperty.kt", ObjectPropertyKt::main);
  }

  @Test
  public void testInitSection() {
    testExample("Examples/ComplexConstructors/InitSection.kt", complexconstructors.InitSectionKt::main);
  }

  @Test
  public void testSimpleConstructor() {
    testExample("Examples/ComplexConstructors/SimpleConstructor.kt", complexconstructors.SimpleConstructorKt::main);
  }

  @Test
  public void testCar() {
    testExample("Examples/Composition/Car.kt", composition.CarKt::main);
  }

  @Test
  public void testArg() {
    testExample("Examples/Constructors/Arg.kt", ArgKt::main);
  }

  @Test
  public void testBear() {
    testExample("Examples/Constructors/Bear.kt", complexconstructors.BearKt::main);
  }

  @Test
  public void testDisplayAlienSpecies() {
    testExample("Examples/Constructors/DisplayAlienSpecies.kt", DisplayAlienSpeciesKt::main);
  }

  @Test
  public void testMultipleArgs() {
    testExample("Examples/Constructors/MultipleArgs.kt", MultipleArgsKt::main);
  }

  @Test
  public void testScientist() {
    testExample("Examples/Constructors/Scientist.kt", ScientistKt::main);
  }

  @Test
  public void testVisibleArgs() {
    testExample("Examples/Constructors/VisibleArgs.kt", VisibleArgsKt::main);
  }

  @Test
  public void testAnimals() {
    testExample("Examples/CreatingClasses/Animals.kt", AnimalsKt::main);
  }

  @Test
  public void testCat() {
    testExample("Examples/CreatingClasses/Cat.kt", CatKt::main);
  }

  @Test
  public void testDog() {
    testExample("Examples/CreatingClasses/Dog.kt", DogKt::main);
  }

  @Test
  public void testHamster() {
    testExample("Examples/CreatingClasses/Hamster.kt", HamsterKt::main);
  }

  @Test
  public void testCopyDataClass() {
    testExample("Examples/DataClasses/CopyDataClass.kt", CopyDataClassKt::main);
  }

  @Test
  public void testDataClasses() {
    testExample("Examples/DataClasses/DataClasses.kt", dataclasses.DataClassesKt::main);
  }

  @Test
  public void testSimple() {
    testExample("Examples/DataClasses/Simple.kt", SimpleKt::main);
  }

  @Test
  public void testInference() {
    testExample("Examples/DataTypes/Inference.kt", InferenceKt::main);
  }

  @Test
  public void testStringPlusNumber() {
    testExample("Examples/DataTypes/StringPlusNumber.kt", StringPlusNumberKt::main);
  }

  @Test
  public void testTypes() {
    testExample("Examples/DataTypes/Types.kt", TypesKt::main);
  }

  @Test
  public void testDelegateProvider() {
    testExample("Examples/DelegationTools/DelegateProvider.kt", delegationtools.DelegateProviderKt::main);
  }

  @Test
  public void testDelegToolsSoln1() {
    testExample("Examples/DelegationTools/DelegToolsSoln1.kt", delegtoolssoln1.DelegToolsSoln1Kt::main);
  }

  @Test
  public void testDelegToolsSoln2() {
    testExample("Examples/DelegationTools/DelegToolsSoln2.kt", delegtoolssoln2.DelegToolsSoln2Kt::main);
  }

  @Test
  public void testDelegToolsSoln3() {
    testExample("Examples/DelegationTools/DelegToolsSoln3.kt", delegtoolssoln3.DelegToolsSoln3Kt::main);
  }

  @Test
  public void testNeverNull() {
    testExample("Examples/DelegationTools/NeverNull.kt", delegationtools.NeverNullKt::main);
  }

  @Test
  public void testTeam() {
    testExample("Examples/DelegationTools/Team.kt", delegationtools.TeamKt::main);
  }

  @Test
  public void testTeamWithTraditions() {
    testExample("Examples/DelegationTools/TeamWithTraditions.kt", delegationtools.TeamWithTraditionsKt::main);
  }

  @Test
  public void testComputation() {
    testExample("Examples/Destructuring/Computation.kt", destructuring.ComputationKt::main);
  }

  @Test
  public void testForLoop() {
    testExample("Examples/Destructuring/ForLoop.kt", destructuringInLoops.ForLoopKt::main);
  }

  @Test
  public void testLoopWithIndex() {
    testExample("Examples/Destructuring/LoopWithIndex.kt", destructuringInLoops.LoopWithIndexKt::main);
  }

  @Test
  public void testPairDestructuring() {
    testExample("Examples/Destructuring/PairDestructuring.kt", destructuring.PairDestructuringKt::main);
  }

  @Test
  public void testPairs() {
    testExample("Examples/Destructuring/Pairs.kt", destructuring.PairsKt::main);
  }

  @Test
  public void testTuple() {
    testExample("Examples/Destructuring/Tuple.kt", destructuring.TupleKt::main);
  }

  @Test
  public void testCreature() {
    testExample("Examples/DownCasting/Creature.kt", downcasting.CreatureKt::main);
  }

  @Test
  public void testFilterIsInstance() {
    testExample("Examples/DownCasting/FilterIsInstance.kt", downcasting.FilterIsInstanceKt::main);
  }

  @Test
  public void testFindType() {
    testExample("Examples/DownCasting/FindType.kt", downcasting.FindTypeKt::main);
  }

  @Test
  public void testIsKeyword() {
    testExample("Examples/DownCasting/IsKeyword.kt", downcasting.IsKeywordKt::main);
  }

  @Test
  public void testNarrowingUpcast() {
    testExample("Examples/DownCasting/NarrowingUpcast.kt", downcasting.NarrowingUpcastKt::main);
  }

  @Test
  public void testSafe() {
    testExample("Examples/DownCasting/Safe.kt", downcasting.SafeKt::main);
  }

  @Test
  public void testUnsafe() {
    testExample("Examples/DownCasting/Unsafe.kt", downcasting.UnsafeKt::main);
  }

  @Test
  public void testCheckingOptions() {
    testExample("Examples/Enumerations/CheckingOptions.kt", CheckingOptionsKt::main);
  }

  @Test
  public void testDirection() {
    testExample("Examples/Enumerations/Direction.kt", enumerations.DirectionKt::main);
  }

  @Test
  public void testEnumImport() {
    testExample("Examples/Enumerations/EnumImport.kt", EnumImportKt::main);
  }

  @Test
  public void testLevel() {
    testExample("Examples/Enumerations/Level.kt", enumerations.LevelKt::main);
  }

  @Test
  public void testRecursiveEnumImport() {
    testExample("Examples/Enumerations/RecursiveEnumImport.kt", enumerations.RecursiveEnumImportKt::main);
  }

  @Test
  public void testCaptureImplementation() {
    testExample("Examples/ExceptionHandling/CaptureImplementation.kt", exceptionhandling.CaptureImplementationKt::main);
  }

  @Test
  public void testDefiningExceptions() {
    testExample("Examples/ExceptionHandling/DefiningExceptions.kt", exceptionhandling.DefiningExceptionsKt::main);
  }

  @Test
  public void testExceptHandlingSoln1() {
    testExample("Examples/ExceptionHandling/ExceptHandlingSoln1.kt", exceptionhandlingsoln1.ExceptHandlingSoln1Kt::main);
  }

  @Test
  public void testExceptHandlingSoln2() {
    testExample("Examples/ExceptionHandling/ExceptHandlingSoln2.kt", exceptionhandlingsolution2.ExceptHandlingSoln2Kt::main);
  }

  @Test
  public void testExceptHandlingSoln3() {
    testExample("Examples/ExceptionHandling/ExceptHandlingSoln3.kt", exceptionhandlingsoln3.ExceptHandlingSoln3Kt::main);
  }

  @Test
  public void testGuaranteedCleanup() {
    testExample("Examples/ExceptionHandling/GuaranteedCleanup.kt", exceptionhandling.GuaranteedCleanupKt::main);
  }

  @Test
  public void testHandlers() {
    testExample("Examples/ExceptionHandling/Handlers.kt", exceptionhandling.HandlersKt::main);
  }

  @Test
  public void testHierarchy() {
    testExample("Examples/ExceptionHandling/Hierarchy.kt", exceptionhandling.HierarchyKt::main);
  }

  @Test
  public void testLibraryException() {
    testExample("Examples/ExceptionHandling/LibraryException.kt", exceptionhandling.LibraryExceptionKt::main);
  }

  @Test
  public void testNewException() {
    testExample("Examples/ExceptionHandling/NewException.kt", exceptionhandling.NewExceptionKt::main);
  }

  @Test
  public void testStacktrace() {
    testExample("Examples/ExceptionHandling/Stacktrace.kt", stacktrace.StacktraceKt::main);
  }

  @Test
  public void testTryFinally() {
    testExample("Examples/ExceptionHandling/TryFinally.kt", exceptionhandling.TryFinallyKt::main);
  }

  @Test
  public void testAverageIncome() {
    testExample("Examples/Exceptions/AverageIncome.kt", firstversion.AverageIncomeKt::main);
  }

  @Test
  public void testAverageIncomeWithException() {
    testExample("Examples/Exceptions/AverageIncomeWithException.kt", properexception.AverageIncomeWithExceptionKt::main);
  }

  @Test
  public void testAverageIncomeWithNull() {
    testExample("Examples/Exceptions/AverageIncomeWithNull.kt", withnull.AverageIncomeWithNullKt::main);
  }

  @Test
  public void testIntroducingCapture() {
    testExample("Examples/Exceptions/IntroducingCapture.kt", IntroducingCaptureKt::main);
  }

  @Test
  public void testIntroducingNull() {
    testExample("Examples/Exceptions/IntroducingNull.kt", IntroducingNullKt::main);
  }

  @Test
  public void testToIntException() {
    testExample("Examples/Exceptions/ToIntException.kt", ToIntExceptionKt::main);
  }

  @Test
  public void testAssigningAnIf() {
    testExample("Examples/ExpressionsStatements/AssigningAnIf.kt", AssigningAnIfKt::main);
  }

  @Test
  public void testConfusing() {
    testExample("Examples/ExpressionsStatements/Confusing.kt", ConfusingKt::main);
  }

  @Test
  public void testForIsAStatement() {
    testExample("Examples/ExpressionsStatements/ForIsAStatement.kt", ForIsAStatementKt::main);
  }

  @Test
  public void testPostfixVsPrefix() {
    testExample("Examples/ExpressionsStatements/PostfixVsPrefix.kt", PostfixVsPrefixKt::main);
  }

  @Test
  public void testUnitReturnType() {
    testExample("Examples/ExpressionsStatements/UnitReturnType.kt", UnitReturnTypeKt::main);
  }

  @Test
  public void testBookExtensions() {
    testExample("Examples/ExtensionFunctions/BookExtensions.kt", BookExtensionsKt::main);
  }

  @Test
  public void testQuote() {
    testExample("Examples/ExtensionFunctions/Quote.kt", other.QuoteKt::main);
  }

  @Test
  public void testQuoting() {
    testExample("Examples/ExtensionFunctions/Quoting.kt", quoting.QuotingKt::main);
  }

  @Test
  public void testStrangeQuote() {
    testExample("Examples/ExtensionFunctions/StrangeQuote.kt", StrangeQuoteKt::main);
  }

  @Test
  public void testAnyFromListOfStar() {
    testExample("Examples/ExtensionProperties/AnyFromListOfStar.kt", extensionproperties.AnyFromListOfStarKt::main);
  }

  @Test
  public void testGenericListExt() {
    testExample("Examples/ExtensionProperties/GenericListExt.kt", extensionproperties.GenericListExtKt::main);
  }

  @Test
  public void testListOfStar() {
    testExample("Examples/ExtensionProperties/ListOfStar.kt", extensionproperties.ListOfStarKt::main);
  }

  @Test
  public void testStringIndices() {
    testExample("Examples/ExtensionProperties/StringIndices.kt", extensionproperties.StringIndicesKt::main);
  }

  @Test
  public void testFoldAndReduce() {
    testExample("Examples/FoldingLists/FoldAndReduce.kt", FoldAndReduceKt::main);
  }

  @Test
  public void testFoldRight() {
    testExample("Examples/FoldingLists/FoldRight.kt", FoldRightKt::main);
  }

  @Test
  public void testFoldVsForLoop() {
    testExample("Examples/FoldingLists/FoldVsForLoop.kt", FoldVsForLoopKt::main);
  }

  @Test
  public void testSumViaFold() {
    testExample("Examples/FoldingLists/SumViaFold.kt", SumViaFoldKt::main);
  }

  @Test
  public void testMultiplyByFour() {
    testExample("Examples/Functions/MultiplyByFour.kt", MultiplyByFourKt::main);
  }

  @Test
  public void testMultiplyByThree() {
    testExample("Examples/Functions/MultiplyByThree.kt", MultiplyByThreeKt::main);
  }

  @Test
  public void testMultiplyByTwo() {
    testExample("Examples/Functions/MultiplyByTwo.kt", MultiplyByTwoKt::main);
  }

  @Test
  public void testSayHello() {
    testExample("Examples/Functions/SayHello.kt", SayHelloKt::main);
  }

  @Test
  public void testBasicGenerics() {
    testExample("Examples/Generics/BasicGenerics.kt", generics.BasicGenericsKt::main);
  }

  @Test
  public void testCarHolder() {
    testExample("Examples/Generics/CarHolder.kt", generics.CarHolderKt::main);
  }

  @Test
  public void testGenericSafeCast() {
    testExample("Examples/Generics/GenericSafeCast.kt", generics.GenericSafeCastKt::main);
  }

  @Test
  public void testGenericSpeakers() {
    testExample("Examples/Generics/GenericSpeakers.kt", generics.GenericSpeakersKt::main);
  }

  @Test
  public void testGetAShape() {
    testExample("Examples/Generics/GetAShape.kt", generics.GetAShapeKt::main);
  }

  @Test
  public void testHolder() {
    testExample("Examples/Generics/Holder.kt", generics.HolderKt::main);
  }

  @Test
  public void testPerform() {
    testExample("Examples/Generics/Perform.kt", generics.PerformKt::main);
  }

  @Test
  public void testSpeakers() {
    testExample("Examples/Generics/Speakers.kt", generics.SpeakersKt::main);
  }

  @Test
  public void testEasyKeys() {
    testExample("Examples/Hashing/EasyKeys.kt", hashing.EasyKeysKt::main);
  }

  @Test
  public void testHashCodeFailure() {
    testExample("Examples/Hashing/HashCodeFailure.kt", HashCodeFailureKt::main);
  }

  @Test
  public void testKeyFailure() {
    testExample("Examples/Hashing/KeyFailure.kt", KeyFailureKt::main);
  }

  @Test
  public void testPets() {
    testExample("Examples/Hashing/Pets.kt", hashing.PetsKt::main);
  }

  @Test
  public void testSimpleHashing() {
    testExample("Examples/Hashing/SimpleHashing.kt", SimpleHashingKt::main);
  }

  @Test
  public void testStringHashCode() {
    testExample("Examples/Hashing/StringHashCode.kt", StringHashCodeKt::main);
  }

  @Test
  public void testUnpredictableHashing() {
    testExample("Examples/Hashing/UnpredictableHashing.kt", UnpredictableHashingKt::main);
  }

  @Test
  public void testEmptyProgram() {
    testExample("Examples/HelloWorld/EmptyProgram.kt", EmptyProgramKt::main);
  }

  @Test
  public void testHelloWorld() {
    testExample("Examples/HelloWorld/HelloWorld.kt", HelloWorldKt::main);
  }

  @Test
  public void testAny() {
    testExample("Examples/HigherOrderFunctions/Any.kt", AnyKt::main);
  }

  @Test
  public void testNullableFunction() {
    testExample("Examples/HigherOrderFunctions/NullableFunction.kt", NullableFunctionKt::main);
  }

  @Test
  public void testNullableReturn() {
    testExample("Examples/HigherOrderFunctions/NullableReturn.kt", NullableReturnKt::main);
  }

  @Test
  public void testRepeatByInt() {
    testExample("Examples/HigherOrderFunctions/RepeatByInt.kt", RepeatByIntKt::main);
  }

  @Test
  public void testRepeatFun() {
    testExample("Examples/HigherOrderFunctions/RepeatFun.kt", definingrepeat.RepeatFunKt::main);
  }

  @Test
  public void testRepeatVerbose() {
    testExample("Examples/HigherOrderFunctions/RepeatVerbose.kt", RepeatVerboseKt::main);
  }

  @Test
  public void testSimpleOperation() {
    testExample("Examples/HigherOrderFunctions/SimpleOperation.kt", SimpleOperationKt::main);
  }

  @Test
  public void testTypeDeclarations() {
    testExample("Examples/HigherOrderFunctions/TypeDeclarations.kt", TypeDeclarationsKt::main);
  }

  @Test
  public void testIf1() {
    testExample("Examples/IfExpressions/If1.kt", If1Kt::main);
  }

  @Test
  public void testIf2() {
    testExample("Examples/IfExpressions/If2.kt", If2Kt::main);
  }

  @Test
  public void testIf3() {
    testExample("Examples/IfExpressions/If3.kt", If3Kt::main);
  }

  @Test
  public void testIf4() {
    testExample("Examples/IfExpressions/If4.kt", If4Kt::main);
  }

  @Test
  public void testIf5() {
    testExample("Examples/IfExpressions/If5.kt", If5Kt::main);
  }

  @Test
  public void testIf6() {
    testExample("Examples/IfExpressions/If6.kt", If6Kt::main);
  }

  @Test
  public void testOneOrTheOther() {
    testExample("Examples/IfExpressions/OneOrTheOther.kt", OneOrTheOtherKt::main);
  }

  @Test
  public void testTrueOrFalse() {
    testExample("Examples/IfExpressions/TrueOrFalse.kt", TrueOrFalseKt::main);
  }

  @Test
  public void testColorBlend() {
    testExample("Examples/Immutability/ColorBlend.kt", colorblend.ColorBlendKt::main);
  }

  @Test
  public void testDataClassCopy() {
    testExample("Examples/Immutability/DataClassCopy.kt", DataClassCopyKt::main);
  }

  @Test
  public void testMutableBlendMap() {
    testExample("Examples/Immutability/MutableBlendMap.kt", mutableblendmap.MutableBlendMapKt::main);
  }

  @Test
  public void testMutableBlendMap2() {
    testExample("Examples/Immutability/MutableBlendMap2.kt", mutableblendmap2.MutableBlendMap2Kt::main);
  }

  @Test
  public void testReadOnlyBlendMap() {
    testExample("Examples/Immutability/ReadOnlyBlendMap.kt", readonlyblendmap.ReadOnlyBlendMapKt::main);
  }

  @Test
  public void testReadOnlyBlendMap2() {
    testExample("Examples/Immutability/ReadOnlyBlendMap2.kt", readonlyblendmap2.ReadOnlyBlendMap2Kt::main);
  }

  @Test
  public void testReadOnlyBlendMap3() {
    testExample("Examples/Immutability/ReadOnlyBlendMap3.kt", readonlyblendmap3.ReadOnlyBlendMap3Kt::main);
  }

  @Test
  public void testReadOnlyBlendMap4() {
    testExample("Examples/Immutability/ReadOnlyBlendMap4.kt", readonlyblendmap4.ReadOnlyBlendMap4Kt::main);
  }

  @Test
  public void testXYZFlatMap() {
    testExample("Examples/Immutability/XYZFlatMap.kt", xyzflatmap.XYZFlatMapKt::main);
  }

  @Test
  public void testXYZMap() {
    testExample("Examples/Immutability/XYZMap.kt", xyzmap.XYZMapKt::main);
  }

  @Test
  public void testClosures() {
    testExample("Examples/ImportanceOfLambdas/Closures.kt", ClosuresKt::main);
  }

  @Test
  public void testClosures2() {
    testExample("Examples/ImportanceOfLambdas/Closures2.kt", Closures2Kt::main);
  }

  @Test
  public void testFilter() {
    testExample("Examples/ImportanceOfLambdas/Filter.kt", FilterKt::main);
  }

  @Test
  public void testFilterEven() {
    testExample("Examples/ImportanceOfLambdas/FilterEven.kt", FilterEvenKt::main);
  }

  @Test
  public void testFunctionClosure() {
    testExample("Examples/ImportanceOfLambdas/FunctionClosure.kt", FunctionClosureKt::main);
  }

  @Test
  public void testGreaterThan2() {
    testExample("Examples/ImportanceOfLambdas/GreaterThan2.kt", GreaterThan2Kt::main);
  }

  @Test
  public void testStoringLambda() {
    testExample("Examples/ImportanceOfLambdas/StoringLambda.kt", StoringLambdaKt::main);
  }

  @Test
  public void testSum() {
    testExample("Examples/ImportanceOfLambdas/Sum.kt", SumKt::main);
  }

  @Test
  public void testGreatApe() {
    testExample("Examples/Inheritance/GreatApe.kt", inheritance.ape1.GreatApeKt::main);
  }

  @Test
  public void testGreatApe2() {
    testExample("Examples/Inheritance/GreatApe2.kt", inheritance.ape2.GreatApe2Kt::main);
  }

  @Test
  public void testAdapter() {
    testExample("Examples/InheritanceExtensions/Adapter.kt", inheritanceextensions.AdapterKt::main);
  }

  @Test
  public void testComposeAdapter() {
    testExample("Examples/InheritanceExtensions/ComposeAdapter.kt", inheritanceextensions2.ComposeAdapterKt::main);
  }

  @Test
  public void testConvention() {
    testExample("Examples/InheritanceExtensions/Convention.kt", inheritanceextensions.ConventionKt::main);
  }

  @Test
  public void testDeviceExtensions() {
    testExample("Examples/InheritanceExtensions/DeviceExtensions.kt", inheritanceextensions2.DeviceExtensionsKt::main);
  }

  @Test
  public void testDeviceMembers() {
    testExample("Examples/InheritanceExtensions/DeviceMembers.kt", inheritanceextensions1.DeviceMembersKt::main);
  }

  @Test
  public void testExtensionFuncs() {
    testExample("Examples/InheritanceExtensions/ExtensionFuncs.kt", inheritanceextensions2.ExtensionFuncsKt::main);
  }

  @Test
  public void testInheritAdd() {
    testExample("Examples/InheritanceExtensions/InheritAdd.kt", inheritanceextensions.InheritAddKt::main);
  }

  @Test
  public void testInhExtensionsEx2() {
    testExample("Examples/InheritanceExtensions/InhExtensionsEx2.kt", inheritanceAndExtensionsExercise2.InhExtensionsEx2Kt::main);
  }

  @Test
  public void testTemperatureDelta() {
    testExample("Examples/InheritanceExtensions/TemperatureDelta.kt", inheritanceextensions.TemperatureDeltaKt::main);
  }

  @Test
  public void testCharRange() {
    testExample("Examples/InKeyword/CharRange.kt", CharRangeKt::main);
  }

  @Test
  public void testFloatingPointRange() {
    testExample("Examples/InKeyword/FloatingPointRange.kt", FloatingPointRangeKt::main);
  }

  @Test
  public void testInString() {
    testExample("Examples/InKeyword/InString.kt", InStringKt::main);
  }

  @Test
  public void testIterationVsMembership() {
    testExample("Examples/InKeyword/IterationVsMembership.kt", IterationVsMembershipKt::main);
  }

  @Test
  public void testMembershipInRange() {
    testExample("Examples/InKeyword/MembershipInRange.kt", MembershipInRangeKt::main);
  }

  @Test
  public void testMembershipUsingBounds() {
    testExample("Examples/InKeyword/MembershipUsingBounds.kt", MembershipUsingBoundsKt::main);
  }

  @Test
  public void testStringRange() {
    testExample("Examples/InKeyword/StringRange.kt", StringRangeKt::main);
  }

  @Test
  public void testCounterFactory() {
    testExample("Examples/InnerClasses/CounterFactory.kt", innerclasses.CounterFactoryKt::main);
  }

  @Test
  public void testHotel() {
    testExample("Examples/InnerClasses/Hotel.kt", innerclasses.HotelKt::main);
  }

  @Test
  public void testInnerClassInheritance() {
    testExample("Examples/InnerClasses/InnerClassInheritance.kt", innerclasses.InnerClassInheritanceKt::main);
  }

  @Test
  public void testLocalInnerClasses() {
    testExample("Examples/InnerClasses/LocalInnerClasses.kt", innerclasses.LocalInnerClassesKt::main);
  }

  @Test
  public void testQualifiedThis() {
    testExample("Examples/InnerClasses/QualifiedThis.kt", innerclasses.QualifiedThisKt::main);
  }

  @Test
  public void testComputer() {
    testExample("Examples/Interfaces/Computer.kt", interfaces.ComputerKt::main);
  }

  @Test
  public void testPlayerInterface() {
    testExample("Examples/Interfaces/PlayerInterface.kt", propertiesininterfaces.PlayerInterfaceKt::main);
  }

  @Test
  public void testAnnotatedJava() {
    testExample("Examples/Interoperability/AnnotatedJava.kt", interop.AnnotatedJavaKt::main);
  }

  @Test
  public void testBigFibonacci() {
    testExample("Examples/Interoperability/BigFibonacci.kt", interop.BigFibonacciKt::main);
  }

  @Test
  public void testExtensionsToJavaClass() {
    testExample("Examples/Interoperability/ExtensionsToJavaClass.kt", interop.ExtensionsToJavaClassKt::main);
  }

  @Test
  public void testHiddenArrayList() {
    testExample("Examples/Interoperability/HiddenArrayList.kt", interop.HiddenArrayListKt::main);
  }

  @Test
  public void testJavaList() {
    testExample("Examples/Interoperability/JavaList.kt", interop.JavaListKt::main);
  }

  @Test
  public void testKotlinChecked() {
    testExample("Examples/Interoperability/KotlinChecked.kt", interop.KotlinCheckedKt::main);
  }

  @Test
  public void testNPEOnPlatformType() {
    testExample("Examples/Interoperability/NPEOnPlatformType.kt", interop.NPEOnPlatformTypeKt::main);
  }

  @Test
  public void testPlatformTypes() {
    testExample("Examples/Interoperability/PlatformTypes.kt", interop.PlatformTypesKt::main);
  }

  @Test
  public void testRandom() {
    testExample("Examples/Interoperability/Random.kt", interop.RandomKt::main);
  }

  @Test
  public void testReadOnlyCollections() {
    testExample("Examples/Interoperability/ReadOnlyCollections.kt", interop.ReadOnlyCollectionsKt::main);
  }

  @Test
  public void testUseBeanClass() {
    testExample("Examples/Interoperability/UseBeanClass.kt", interop.UseBeanClassKt::main);
  }

  @Test
  public void testAnyInstead() {
    testExample("Examples/IntroGenerics/AnyInstead.kt", introgenerics.AnyInsteadKt::main);
  }

  @Test
  public void testGenericFunction() {
    testExample("Examples/IntroGenerics/GenericFunction.kt", introgenerics.GenericFunctionKt::main);
  }

  @Test
  public void testGenericHolder() {
    testExample("Examples/IntroGenerics/GenericHolder.kt", introgenerics.GenericHolderKt::main);
  }

  @Test
  public void testGenericListExtensions() {
    testExample("Examples/IntroGenerics/GenericListExtensions.kt", introgenerics.GenericListExtensionsKt::main);
  }

  @Test
  public void testRigidHolder() {
    testExample("Examples/IntroGenerics/RigidHolder.kt", introgenerics.RigidHolderKt::main);
  }

  @Test
  public void testBasicLambda() {
    testExample("Examples/Lambdas/BasicLambda.kt", BasicLambdaKt::main);
  }

  @Test
  public void testJoinToString() {
    testExample("Examples/Lambdas/JoinToString.kt", JoinToStringKt::main);
  }

  @Test
  public void testLambdaAndNamedArgs() {
    testExample("Examples/Lambdas/LambdaAndNamedArgs.kt", LambdaAndNamedArgsKt::main);
  }

  @Test
  public void testLambdaIt() {
    testExample("Examples/Lambdas/LambdaIt.kt", LambdaItKt::main);
  }

  @Test
  public void testLambdaTypeInference() {
    testExample("Examples/Lambdas/LambdaTypeInference.kt", LambdaTypeInferenceKt::main);
  }

  @Test
  public void testListIndicesMap() {
    testExample("Examples/Lambdas/ListIndicesMap.kt", ListIndicesMapKt::main);
  }

  @Test
  public void testMapping() {
    testExample("Examples/Lambdas/Mapping.kt", MappingKt::main);
  }

  @Test
  public void testOmittingParentheses() {
    testExample("Examples/Lambdas/OmittingParentheses.kt", OmittingParenthesesKt::main);
  }

  @Test
  public void testTwoArgLambda() {
    testExample("Examples/Lambdas/TwoArgLambda.kt", TwoArgLambdaKt::main);
  }

  @Test
  public void testUnderscore() {
    testExample("Examples/Lambdas/Underscore.kt", UnderscoreKt::main);
  }

  @Test
  public void testZeroArguments() {
    testExample("Examples/Lambdas/ZeroArguments.kt", ZeroArgumentsKt::main);
  }

  @Test
  public void testAnonymousFunction() {
    testExample("Examples/LambdaWithReceiver/AnonymousFunction.kt", lambdawithreceiver.AnonymousFunctionKt::main);
  }

  @Test
  public void testBuildLists() {
    testExample("Examples/LambdaWithReceiver/BuildLists.kt", buildinglists.BuildListsKt::main);
  }

  @Test
  public void testBuildString() {
    testExample("Examples/LambdaWithReceiver/BuildString.kt", buildstring.BuildStringKt::main);
  }

  @Test
  public void testNewStateMachine2() {
    testExample("Examples/LambdaWithReceiver/NewStateMachine2.kt", statemachine2.NewStateMachine2Kt::main);
  }

  @Test
  public void testStringBuilder() {
    testExample("Examples/LambdaWithReceiver/StringBuilder.kt", lambdawithreceiver.StringBuilderKt::main);
  }

  @Test
  public void testUseNewStateMachine1() {
    testExample("Examples/LambdaWithReceiver/UseNewStateMachine1.kt", statemachine.UseNewStateMachine1Kt::main);
  }

  @Test
  public void testUseNewStateMachine2() {
    testExample("Examples/LambdaWithReceiver/UseNewStateMachine2.kt", statemachine2.UseNewStateMachine2Kt::main);
  }

  @Test
  public void testBetterSuitcase() {
    testExample("Examples/LateInitialization/BetterSuitcase.kt", lateinitialization.BetterSuitcaseKt::main);
  }

  @Test
  public void testFaultySuitcase() {
    testExample("Examples/LateInitialization/FaultySuitcase.kt", lateinitialization.FaultySuitcaseKt::main);
  }

  @Test
  public void testIsInitialized() {
    testExample("Examples/LateInitialization/IsInitialized.kt", lateinitialization.IsInitializedKt::main);
  }

  @Test
  public void testLateInitSoln1() {
    testExample("Examples/LateInitialization/LateInitSoln1.kt", lateinitializationsoln1.LateInitSoln1Kt::main);
  }

  @Test
  public void testLateInitSoln2() {
    testExample("Examples/LateInitialization/LateInitSoln2.kt", lateinitializationsoln2.LateInitSoln2Kt::main);
  }

  @Test
  public void testLateInitSoln3() {
    testExample("Examples/LateInitialization/LateInitSoln3.kt", lateinitializationsoln3.LateInitSoln3Kt::main);
  }

  @Test
  public void testSuitcase() {
    testExample("Examples/LateInitialization/Suitcase.kt", lateinitialization.SuitcaseKt::main);
  }

  @Test
  public void testLazyInitSoln1() {
    testExample("Examples/LazyInitialization/LazyInitSoln1.kt", lazyinitsoln1.LazyInitSoln1Kt::main);
  }

  @Test
  public void testLazyInitSoln2() {
    testExample("Examples/LazyInitialization/LazyInitSoln2.kt", lazyinitsoln2.LazyInitSoln2Kt::main);
  }

  @Test
  public void testLazyInitSoln3() {
    testExample("Examples/LazyInitialization/LazyInitSoln3.kt", lazyinitsoln3.LazyInitSoln3Kt::main);
  }

  @Test
  public void testLazyInt() {
    testExample("Examples/LazyInitialization/LazyInt.kt", LazyIntKt::main);
  }

  @Test
  public void testLazySyntax() {
    testExample("Examples/LazyInitialization/LazySyntax.kt", lazyinitialization.LazySyntaxKt::main);
  }

  @Test
  public void testPropertyOptions() {
    testExample("Examples/LazyInitialization/PropertyOptions.kt", lazyinitialization.PropertyOptionsKt::main);
  }

  @Test
  public void testLists() {
    testExample("Examples/Lists/Lists.kt", ListsKt::main);
  }

  @Test
  public void testListUsefulFunction() {
    testExample("Examples/Lists/ListUsefulFunction.kt", ListUsefulFunctionKt::main);
  }

  @Test
  public void testMultipleListRefs() {
    testExample("Examples/Lists/MultipleListRefs.kt", MultipleListRefsKt::main);
  }

  @Test
  public void testMutableList() {
    testExample("Examples/Lists/MutableList.kt", MutableListKt::main);
  }

  @Test
  public void testMutListIsList() {
    testExample("Examples/Lists/MutListIsList.kt", MutListIsListKt::main);
  }

  @Test
  public void testOutOfBounds() {
    testExample("Examples/Lists/OutOfBounds.kt", OutOfBoundsKt::main);
  }

  @Test
  public void testParameterizedReturn() {
    testExample("Examples/Lists/ParameterizedReturn.kt", ParameterizedReturnKt::main);
  }

  @Test
  public void testParameterizedTypes() {
    testExample("Examples/Lists/ParameterizedTypes.kt", ParameterizedTypesKt::main);
  }

  @Test
  public void testCustomLabel() {
    testExample("Examples/LocalFunctions/CustomLabel.kt", CustomLabelKt::main);
  }

  @Test
  public void testInterestingSessions() {
    testExample("Examples/LocalFunctions/InterestingSessions.kt", localfunctions.InterestingSessionsKt::main);
  }

  @Test
  public void testLabeledReturn() {
    testExample("Examples/LocalFunctions/LabeledReturn.kt", LabeledReturnKt::main);
  }

  @Test
  public void testLocalExtensions() {
    testExample("Examples/LocalFunctions/LocalExtensions.kt", LocalExtensionsKt::main);
  }

  @Test
  public void testLocalFunctionReference() {
    testExample("Examples/LocalFunctions/LocalFunctionReference.kt", localfunctions.LocalFunctionReferenceKt::main);
  }

  @Test
  public void testLocalFunctions() {
    testExample("Examples/LocalFunctions/LocalFunctions.kt", LocalFunctionsKt::main);
  }

  @Test
  public void testReturnFromFun() {
    testExample("Examples/LocalFunctions/ReturnFromFun.kt", ReturnFromFunKt::main);
  }

  @Test
  public void testReturningFunc() {
    testExample("Examples/LocalFunctions/ReturningFunc.kt", lambdawithreceiver.ReturningFuncKt::main);
  }

  @Test
  public void testReturnInsideLambda() {
    testExample("Examples/LocalFunctions/ReturnInsideLambda.kt", localfunctions.ReturnInsideLambdaKt::main);
  }

  @Test
  public void testBasicLogging() {
    testExample("Examples/Logging/BasicLogging.kt", logging.BasicLoggingKt::main);
  }

  @Test
  public void testLoggingSoln1() {
    testExample("Examples/Logging/LoggingSoln1.kt", loggingsoln1.LoggingSoln1Kt::main);
  }

  @Test
  public void testLoggingSoln2() {
    testExample("Examples/Logging/LoggingSoln2.kt", loggingsoln2.LoggingSoln2Kt::main);
  }

  @Test
  public void testLoggingSoln3() {
    testExample("Examples/Logging/LoggingSoln3.kt", loggingsoln3.LoggingSoln3Kt::main);
  }

  @Test
  public void testSimpleLoggingStrategy() {
    testExample("Examples/Logging/SimpleLoggingStrategy.kt", logging.SimpleLoggingStrategyKt::main);
  }

  @Test
  public void testUseAtomicLog() {
    testExample("Examples/Logging/UseAtomicLog.kt", UseAtomicLogKt::main);
  }

  @Test
  public void testAddingIntToChar() {
    testExample("Examples/LoopingAndRanges/AddingIntToChar.kt", AddingIntToCharKt::main);
  }

  @Test
  public void testDefiningRanges() {
    testExample("Examples/LoopingAndRanges/DefiningRanges.kt", DefiningRangesKt::main);
  }

  @Test
  public void testForWithCharRange() {
    testExample("Examples/LoopingAndRanges/ForWithCharRange.kt", ForWithCharRangeKt::main);
  }

  @Test
  public void testForWithRanges() {
    testExample("Examples/LoopingAndRanges/ForWithRanges.kt", ForWithRangesKt::main);
  }

  @Test
  public void testHasChar() {
    testExample("Examples/LoopingAndRanges/HasChar.kt", HasCharKt::main);
  }

  @Test
  public void testIndexIntoString() {
    testExample("Examples/LoopingAndRanges/IndexIntoString.kt", IndexIntoStringKt::main);
  }

  @Test
  public void testIterateOverString() {
    testExample("Examples/LoopingAndRanges/IterateOverString.kt", IterateOverStringKt::main);
  }

  @Test
  public void testRepeat() {
    testExample("Examples/LoopingAndRanges/Repeat.kt", RepeatKt::main);
  }

  @Test
  public void testRepeatThreeTimes() {
    testExample("Examples/LoopingAndRanges/RepeatThreeTimes.kt", RepeatThreeTimesKt::main);
  }

  @Test
  public void testSumUsingRange() {
    testExample("Examples/LoopingAndRanges/SumUsingRange.kt", SumUsingRangeKt::main);
  }

  @Test
  public void testFlatten() {
    testExample("Examples/ManipulatingLists/Flatten.kt", FlattenKt::main);
  }

  @Test
  public void testFlattenAndFlatMap() {
    testExample("Examples/ManipulatingLists/FlattenAndFlatMap.kt", FlattenAndFlatMapKt::main);
  }

  @Test
  public void testPlayingCards() {
    testExample("Examples/ManipulatingLists/PlayingCards.kt", manipulatinglists.PlayingCardsKt::main);
  }

  @Test
  public void testWhyFlatMap() {
    testExample("Examples/ManipulatingLists/WhyFlatMap.kt", manipulatinglists.WhyFlatMapKt::main);
  }

  @Test
  public void testZipAndTransform() {
    testExample("Examples/ManipulatingLists/ZipAndTransform.kt", manipulatinglists.ZipAndTransformKt::main);
  }

  @Test
  public void testZipper() {
    testExample("Examples/ManipulatingLists/Zipper.kt", ZipperKt::main);
  }

  @Test
  public void testZippingWithNext() {
    testExample("Examples/ManipulatingLists/ZippingWithNext.kt", ZippingWithNextKt::main);
  }

  @Test
  public void testContactMap() {
    testExample("Examples/Maps/ContactMap.kt", ContactMapKt::main);
  }

  @Test
  public void testGetValue() {
    testExample("Examples/Maps/GetValue.kt", GetValueKt::main);
  }

  @Test
  public void testMaps() {
    testExample("Examples/Maps/Maps.kt", MapsKt::main);
  }

  @Test
  public void testMutableMaps() {
    testExample("Examples/Maps/MutableMaps.kt", MutableMapsKt::main);
  }

  @Test
  public void testReadOnlyMaps() {
    testExample("Examples/Maps/ReadOnlyMaps.kt", ReadOnlyMapsKt::main);
  }

  @Test
  public void testConstructorReference() {
    testExample("Examples/MemberReferences/ConstructorReference.kt", memberreferences3.ConstructorReferenceKt::main);
  }

  @Test
  public void testFunctionReference() {
    testExample("Examples/MemberReferences/FunctionReference.kt", memberreferences2.FunctionReferenceKt::main);
  }

  @Test
  public void testPropertyReference() {
    testExample("Examples/MemberReferences/PropertyReference.kt", memberreferences1.PropertyReferenceKt::main);
  }

  @Test
  public void testSortWith() {
    testExample("Examples/MemberReferences/SortWith.kt", memberreferences1.SortWithKt::main);
  }

  @Test
  public void testTopLevelFunctionRef() {
    testExample("Examples/MemberReferences/TopLevelFunctionRef.kt", memberreferences2.TopLevelFunctionRefKt::main);
  }

  @Test
  public void testArgumentOrder() {
    testExample("Examples/NamedAndDefaultArgs/ArgumentOrder.kt", color1.ArgumentOrderKt::main);
  }

  @Test
  public void testColor2() {
    testExample("Examples/NamedAndDefaultArgs/Color2.kt", color2.Color2Kt::main);
  }

  @Test
  public void testColor3() {
    testExample("Examples/NamedAndDefaultArgs/Color3.kt", color3.Color3Kt::main);
  }

  @Test
  public void testCreateString() {
    testExample("Examples/NamedAndDefaultArgs/CreateString.kt", CreateStringKt::main);
  }

  @Test
  public void testCreateString2() {
    testExample("Examples/NamedAndDefaultArgs/CreateString2.kt", CreateString2Kt::main);
  }

  @Test
  public void testEvaluation() {
    testExample("Examples/NamedAndDefaultArgs/Evaluation.kt", EvaluationKt::main);
  }

  @Test
  public void testNamedArguments() {
    testExample("Examples/NamedAndDefaultArgs/NamedArguments.kt", color1.NamedArgumentsKt::main);
  }

  @Test
  public void testTrimMargin() {
    testExample("Examples/NamedAndDefaultArgs/TrimMargin.kt", TrimMarginKt::main);
  }

  @Test
  public void testAirport() {
    testExample("Examples/NestedClasses/Airport.kt", nestedclasses.AirportKt::main);
  }

  @Test
  public void testFillIt() {
    testExample("Examples/NestedClasses/FillIt.kt", nestedclasses.FillItKt::main);
  }

  @Test
  public void testNestedHouse() {
    testExample("Examples/NestedClasses/NestedHouse.kt", nestedclasses.NestedHouseKt::main);
  }

  @Test
  public void testReturnLocal() {
    testExample("Examples/NestedClasses/ReturnLocal.kt", nestedclasses.ReturnLocalKt::main);
  }

  @Test
  public void testTicket() {
    testExample("Examples/NestedClasses/Ticket.kt", nestedclasses.TicketKt::main);
  }

  @Test
  public void testWithinInterface() {
    testExample("Examples/NestedClasses/WithinInterface.kt", nestedclasses.WithinInterfaceKt::main);
  }

  @Test
  public void testNonNullAssert() {
    testExample("Examples/NonNullAssertions/NonNullAssert.kt", NonNullAssertKt::main);
  }

  @Test
  public void testNonNullAssertCall() {
    testExample("Examples/NonNullAssertions/NonNullAssertCall.kt", NonNullAssertCallKt::main);
  }

  @Test
  public void testValueFromMap() {
    testExample("Examples/NonNullAssertions/ValueFromMap.kt", ValueFromMapKt::main);
  }

  @Test
  public void testCheckObject() {
    testExample("Examples/NothingType/CheckObject.kt", nothingtype.CheckObjectKt::main);
  }

  @Test
  public void testCheckObject2() {
    testExample("Examples/NothingType/CheckObject2.kt", nothingtype.CheckObject2Kt::main);
  }

  @Test
  public void testFail() {
    testExample("Examples/NothingType/Fail.kt", nothingtype.FailKt::main);
  }

  @Test
  public void testListOfNothing() {
    testExample("Examples/NothingType/ListOfNothing.kt", nothingtype.ListOfNothingKt::main);
  }

  @Test
  public void testNothingTypeSoln1() {
    testExample("Examples/NothingType/NothingTypeSoln1.kt", nothingtypesoln1.NothingTypeSoln1Kt::main);
  }

  @Test
  public void testNothingTypeSoln2() {
    testExample("Examples/NothingType/NothingTypeSoln2.kt", nothingtypesoln2.NothingTypeSoln2Kt::main);
  }

  @Test
  public void testNothingTypeSoln3() {
    testExample("Examples/NothingType/NothingTypeSoln3.kt", nothingtypesoln3.NothingTypeSoln3Kt::main);
  }

  @Test
  public void testTodo() {
    testExample("Examples/NothingType/Todo.kt", nothingtype.TodoKt::main);
  }

  @Test
  public void testDefinition() {
    testExample("Examples/NullableExtensions/Definition.kt", DefinitionKt::main);
  }

  @Test
  public void testNullableParameter() {
    testExample("Examples/NullableExtensions/NullableParameter.kt", NullableParameterKt::main);
  }

  @Test
  public void testStringIsNullOr() {
    testExample("Examples/NullableExtensions/StringIsNullOr.kt", StringIsNullOrKt::main);
  }

  @Test
  public void testAmphibian() {
    testExample("Examples/NullableTypes/Amphibian.kt", AmphibianKt::main);
  }

  @Test
  public void testDereference() {
    testExample("Examples/NullableTypes/Dereference.kt", DereferenceKt::main);
  }

  @Test
  public void testExplicitCheck() {
    testExample("Examples/NullableTypes/ExplicitCheck.kt", ExplicitCheckKt::main);
  }

  @Test
  public void testNullableInMap() {
    testExample("Examples/NullableTypes/NullableInMap.kt", NullableInMapKt::main);
  }

  @Test
  public void testNullableTypes() {
    testExample("Examples/NullableTypes/NullableTypes.kt", NullableTypesKt::main);
  }

  @Test
  public void testNullInMaps() {
    testExample("Examples/NullableTypes/NullInMaps.kt", NullInMapsKt::main);
  }

  @Test
  public void testBiggestLong() {
    testExample("Examples/NumberTypes/BiggestLong.kt", BiggestLongKt::main);
  }

  @Test
  public void testBMIEnglish() {
    testExample("Examples/NumberTypes/BMIEnglish.kt", BMIEnglishKt::main);
  }

  @Test
  public void testBMIMetric() {
    testExample("Examples/NumberTypes/BMIMetric.kt", BMIMetricKt::main);
  }

  @Test
  public void testInferInt() {
    testExample("Examples/NumberTypes/InferInt.kt", InferIntKt::main);
  }

  @Test
  public void testIntDivisionTruncates() {
    testExample("Examples/NumberTypes/IntDivisionTruncates.kt", IntDivisionTruncatesKt::main);
  }

  @Test
  public void testIntegerOverflow() {
    testExample("Examples/NumberTypes/IntegerOverflow.kt", IntegerOverflowKt::main);
  }

  @Test
  public void testLongConstants() {
    testExample("Examples/NumberTypes/LongConstants.kt", LongConstantsKt::main);
  }

  @Test
  public void testModulus() {
    testExample("Examples/NumberTypes/Modulus.kt", ModulusKt::main);
  }

  @Test
  public void testOpOrder() {
    testExample("Examples/NumberTypes/OpOrder.kt", OpOrderKt::main);
  }

  @Test
  public void testOpOrderParens() {
    testExample("Examples/NumberTypes/OpOrderParens.kt", OpOrderParensKt::main);
  }

  @Test
  public void testUsingLongs() {
    testExample("Examples/NumberTypes/UsingLongs.kt", UsingLongsKt::main);
  }

  @Test
  public void testFactory() {
    testExample("Examples/ObjectOrientedDesign/Factory.kt", oodesign.FactoryKt::main);
  }

  @Test
  public void testRobotExplorer() {
    testExample("Examples/ObjectOrientedDesign/RobotExplorer.kt", oodesign.RobotExplorerKt::main);
  }

  @Test
  public void testObjectInheritance() {
    testExample("Examples/Objects/ObjectInheritance.kt", objects.ObjectInheritanceKt::main);
  }

  @Test
  public void testObjectKeyword() {
    testExample("Examples/Objects/ObjectKeyword.kt", objects.ObjectKeywordKt::main);
  }

  @Test
  public void testObjectNesting() {
    testExample("Examples/Objects/ObjectNesting.kt", objects.ObjectNestingKt::main);
  }

  @Test
  public void testShare2() {
    testExample("Examples/Objects/Share2.kt", objectshare2.Share2Kt::main);
  }

  @Test
  public void testConversion() {
    testExample("Examples/ObjectsEverywhere/Conversion.kt", ConversionKt::main);
  }

  @Test
  public void testIntRanges() {
    testExample("Examples/ObjectsEverywhere/IntRanges.kt", IntRangesKt::main);
  }

  @Test
  public void testNumberConversions() {
    testExample("Examples/ObjectsEverywhere/NumberConversions.kt", NumberConversionsKt::main);
  }

  @Test
  public void testRangeSum() {
    testExample("Examples/ObjectsEverywhere/RangeSum.kt", RangeSumKt::main);
  }

  @Test
  public void testStrings() {
    testExample("Examples/ObjectsEverywhere/Strings.kt", StringsKt::main);
  }

  @Test
  public void testByOperations() {
    testExample("Examples/OperationsOnCollections/ByOperations.kt", ByOperationsKt::main);
  }

  @Test
  public void testCreatingLists() {
    testExample("Examples/OperationsOnCollections/CreatingLists.kt", CreatingListsKt::main);
  }

  @Test
  public void testFilterNotNull() {
    testExample("Examples/OperationsOnCollections/FilterNotNull.kt", FilterNotNullKt::main);
  }

  @Test
  public void testListInit() {
    testExample("Examples/OperationsOnCollections/ListInit.kt", ListInitKt::main);
  }

  @Test
  public void testOperationsOnSets() {
    testExample("Examples/OperationsOnCollections/OperationsOnSets.kt", OperationsOnSetsKt::main);
  }

  @Test
  public void testPairOfLists() {
    testExample("Examples/OperationsOnCollections/PairOfLists.kt", PairOfListsKt::main);
  }

  @Test
  public void testPartition() {
    testExample("Examples/OperationsOnCollections/Partition.kt", PartitionKt::main);
  }

  @Test
  public void testPredicates() {
    testExample("Examples/OperationsOnCollections/Predicates.kt", PredicatesKt::main);
  }

  @Test
  public void testTakeOrDrop() {
    testExample("Examples/OperationsOnCollections/TakeOrDrop.kt", TakeOrDropKt::main);
  }

  @Test
  public void testAllOperators() {
    testExample("Examples/OperatorOverloading/AllOperators.kt", operatoroverloading.AllOperatorsKt::main);
  }

  @Test
  public void testBackticks() {
    testExample("Examples/OperatorOverloading/Backticks.kt", BackticksKt::main);
  }

  @Test
  public void testInvoke() {
    testExample("Examples/OperatorOverloading/Invoke.kt", InvokeKt::main);
  }

  @Test
  public void testMemberOperator() {
    testExample("Examples/OperatorOverloading/MemberOperator.kt", operatoroverloading.MemberOperatorKt::main);
  }

  @Test
  public void testMolecule() {
    testExample("Examples/OperatorOverloading/Molecule.kt", MoleculeKt::main);
  }

  @Test
  public void testNum() {
    testExample("Examples/OperatorOverloading/Num.kt", operatoroverloading.NumKt::main);
  }

  @Test
  public void testOpOverloadingSoln1() {
    testExample("Examples/OperatorOverloading/OpOverloadingSoln1.kt", opoverloadingsoln1.OpOverloadingSoln1Kt::main);
  }

  @Test
  public void testOpOverloadingSoln2() {
    testExample("Examples/OperatorOverloading/OpOverloadingSoln2.kt", opoverloadingsoln2.OpOverloadingSoln2Kt::main);
  }

  @Test
  public void testOpOverloadingSoln3() {
    testExample("Examples/OperatorOverloading/OpOverloadingSoln3.kt", opoverloadingsoln3.OpOverloadingSoln3Kt::main);
  }

  @Test
  public void testStringInvoke() {
    testExample("Examples/OperatorOverloading/StringInvoke.kt", StringInvokeKt::main);
  }

  @Test
  public void testSwearing() {
    testExample("Examples/OperatorOverloading/Swearing.kt", SwearingKt::main);
  }

  @Test
  public void testMemberVsExtension() {
    testExample("Examples/Overloading/MemberVsExtension.kt", MemberVsExtensionKt::main);
  }

  @Test
  public void testOverloadedVsDefaultArg() {
    testExample("Examples/Overloading/OverloadedVsDefaultArg.kt", overloadingvsdefaultargs.OverloadedVsDefaultArgKt::main);
  }

  @Test
  public void testOverloading() {
    testExample("Examples/Overloading/Overloading.kt", OverloadingKt::main);
  }

  @Test
  public void testOverloadingAdd() {
    testExample("Examples/Overloading/OverloadingAdd.kt", OverloadingAddKt::main);
  }

  @Test
  public void testWithDefaultArguments() {
    testExample("Examples/Overloading/WithDefaultArguments.kt", withdefaultarguments.WithDefaultArgumentsKt::main);
  }

  @Test
  public void testWithoutDefaultArguments() {
    testExample("Examples/Overloading/WithoutDefaultArguments.kt", withoutdefaultarguments.WithoutDefaultArgumentsKt::main);
  }

  @Test
  public void testFullyQualify() {
    testExample("Examples/Packages/FullyQualify.kt", FullyQualifyKt::main);
  }

  @Test
  public void testImportClass() {
    testExample("Examples/Packages/ImportClass.kt", ImportClassKt::main);
  }

  @Test
  public void testImportEverything() {
    testExample("Examples/Packages/ImportEverything.kt", ImportEverythingKt::main);
  }

  @Test
  public void testImportNameChange() {
    testExample("Examples/Packages/ImportNameChange.kt", ImportNameChangeKt::main);
  }

  @Test
  public void testImportPythagorean() {
    testExample("Examples/Packages/ImportPythagorean.kt", ImportPythagoreanKt::main);
  }

  @Test
  public void testFantasyGame() {
    testExample("Examples/Polymorphism/FantasyGame.kt", polymorphism.FantasyGameKt::main);
  }

  @Test
  public void testPet() {
    testExample("Examples/Polymorphism/Pet.kt", polymorphism.PetKt::main);
  }

  @Test
  public void testPolyExercise3() {
    testExample("Examples/Polymorphism/PolyExercise3.kt", polymorphismExercise3.PolyExercise3Kt::main);
  }

  @Test
  public void testAnUnchangingVar() {
    testExample("Examples/Properties/AnUnchangingVar.kt", AnUnchangingVarKt::main);
  }

  @Test
  public void testChangingAVal() {
    testExample("Examples/Properties/ChangingAVal.kt", ChangingAValKt::main);
  }

  @Test
  public void testCup() {
    testExample("Examples/Properties/Cup.kt", CupKt::main);
  }

  @Test
  public void testCup2() {
    testExample("Examples/Properties/Cup2.kt", Cup2Kt::main);
  }

  @Test
  public void testReferences() {
    testExample("Examples/Properties/References.kt", ReferencesKt::main);
  }

  @Test
  public void testCounter() {
    testExample("Examples/PropertyAccessors/Counter.kt", propertyaccessors.CounterKt::main);
  }

  @Test
  public void testData() {
    testExample("Examples/PropertyAccessors/Data.kt", propertyaccessors.DataKt::main);
  }

  @Test
  public void testDefault() {
    testExample("Examples/PropertyAccessors/Default.kt", DefaultKt::main);
  }

  @Test
  public void testHamsters() {
    testExample("Examples/PropertyAccessors/Hamsters.kt", propertyaccessors.HamstersKt::main);
  }

  @Test
  public void testLogChanges() {
    testExample("Examples/PropertyAccessors/LogChanges.kt", LogChangesKt::main);
  }

  @Test
  public void testAccessibility() {
    testExample("Examples/PropertyDelegation/Accessibility.kt", propertydelegation.AccessibilityKt::main);
  }

  @Test
  public void testAdd() {
    testExample("Examples/PropertyDelegation/Add.kt", propertydelegation2.AddKt::main);
  }

  @Test
  public void testBasicRead() {
    testExample("Examples/PropertyDelegation/BasicRead.kt", propertydelegation.BasicReadKt::main);
  }

  @Test
  public void testBasicRead2() {
    testExample("Examples/PropertyDelegation/BasicRead2.kt", propertydelegation.BasicRead2Kt::main);
  }

  @Test
  public void testBasicReadWrite() {
    testExample("Examples/PropertyDelegation/BasicReadWrite.kt", propertydelegation.BasicReadWriteKt::main);
  }

  @Test
  public void testBasicReadWrite2() {
    testExample("Examples/PropertyDelegation/BasicReadWrite2.kt", propertydelegation.BasicReadWrite2Kt::main);
  }

  @Test
  public void testCarService() {
    testExample("Examples/PropertyDelegation/CarService.kt", propertydelegation.CarServiceKt::main);
  }

  @Test
  public void testConfiguration() {
    testExample("Examples/PropertyDelegation/Configuration.kt", propertydelegation.ConfigurationKt::main);
  }

  @Test
  public void testFibonacciProperty() {
    testExample("Examples/PropertyDelegation/FibonacciProperty.kt", propertydelegation.FibonacciPropertyKt::main);
  }

  @Test
  public void testPropDelegationSoln1() {
    testExample("Examples/PropertyDelegation/PropDelegationSoln1.kt", propertydelegationsoln1.PropDelegationSoln1Kt::main);
  }

  @Test
  public void testPropDelegationSoln2() {
    testExample("Examples/PropertyDelegation/PropDelegationSoln2.kt", propertydelegationsoln2.PropDelegationSoln2Kt::main);
  }

  @Test
  public void testPropDelegationSoln3() {
    testExample("Examples/PropertyDelegation/PropDelegationSoln3.kt", propertydelegationsoln3.PropDelegationSoln3Kt::main);
  }

  @Test
  public void testPropDelegationSoln4() {
    testExample("Examples/PropertyDelegation/PropDelegationSoln4.kt", propertydelegationsoln4.PropDelegationSoln4Kt::main);
  }

  @Test
  public void testCallStack() {
    testExample("Examples/Recursion/CallStack.kt", recursion.CallStackKt::main);
  }

  @Test
  public void testFactorial() {
    testExample("Examples/Recursion/Factorial.kt", recursion.FactorialKt::main);
  }

  @Test
  public void testFibonacci() {
    testExample("Examples/Recursion/Fibonacci.kt", recursion.FibonacciKt::main);
  }

  @Test
  public void testInfiniteRecursion() {
    testExample("Examples/Recursion/InfiniteRecursion.kt", recursion.InfiniteRecursionKt::main);
  }

  @Test
  public void testIteration() {
    testExample("Examples/Recursion/Iteration.kt", iteration.IterationKt::main);
  }

  @Test
  public void testRecursionLimits() {
    testExample("Examples/Recursion/RecursionLimits.kt", recursion.RecursionLimitsKt::main);
  }

  @Test
  public void testTailRecursiveSum() {
    testExample("Examples/Recursion/TailRecursiveSum.kt", tailrecursion.TailRecursiveSumKt::main);
  }

  @Test
  public void testVerySlowFibonacci() {
    testExample("Examples/Recursion/VerySlowFibonacci.kt", slowfibonacci.VerySlowFibonacciKt::main);
  }

  @Test
  public void testAssignmentOperators() {
    testExample("Examples/RepetitionWithWhile/AssignmentOperators.kt", AssignmentOperatorsKt::main);
  }

  @Test
  public void testDoWhileLoop() {
    testExample("Examples/RepetitionWithWhile/DoWhileLoop.kt", DoWhileLoopKt::main);
  }

  @Test
  public void testIncrementOperator() {
    testExample("Examples/RepetitionWithWhile/IncrementOperator.kt", IncrementOperatorKt::main);
  }

  @Test
  public void testWhileLoop() {
    testExample("Examples/RepetitionWithWhile/WhileLoop.kt", WhileLoopKt::main);
  }

  @Test
  public void testAutoCloseable() {
    testExample("Examples/ResourceCleanup/AutoCloseable.kt", resourcecleanup.AutoCloseableKt::main);
  }

  @Test
  public void testForEachLine() {
    testExample("Examples/ResourceCleanup/ForEachLine.kt", resourcecleanup.ForEachLineKt::main);
  }

  @Test
  public void testResourceCleanupSoln1() {
    testExample("Examples/ResourceCleanup/ResourceCleanupSoln1.kt", resourcecleanupsoln1.ResourceCleanupSoln1Kt::main);
  }

  @Test
  public void testResourceCleanupSoln2() {
    testExample("Examples/ResourceCleanup/ResourceCleanupSoln2.kt", resourcecleanupsoln2.ResourceCleanupSoln2Kt::main);
  }

  @Test
  public void testResourceCleanupSoln3() {
    testExample("Examples/ResourceCleanup/ResourceCleanupSoln3.kt", resourcecleanupsoln3.ResourceCleanupSoln3Kt::main);
  }

  @Test
  public void testUsable() {
    testExample("Examples/ResourceCleanup/Usable.kt", resourcecleanup.UsableKt::main);
  }

  @Test
  public void testUseLines() {
    testExample("Examples/ResourceCleanup/UseLines.kt", resourcecleanup.UseLinesKt::main);
  }

  @Test
  public void testChainedCalls() {
    testExample("Examples/SafeCallsAndElvis/ChainedCalls.kt", safecalls.ChainedCallsKt::main);
  }

  @Test
  public void testDereferenceNull() {
    testExample("Examples/SafeCallsAndElvis/DereferenceNull.kt", DereferenceNullKt::main);
  }

  @Test
  public void testElvisCall() {
    testExample("Examples/SafeCallsAndElvis/ElvisCall.kt", elvisoperator.ElvisCallKt::main);
  }

  @Test
  public void testElvisOperator() {
    testExample("Examples/SafeCallsAndElvis/ElvisOperator.kt", ElvisOperatorKt::main);
  }

  @Test
  public void testSafeCall() {
    testExample("Examples/SafeCallsAndElvis/SafeCall.kt", safecalls.SafeCallKt::main);
  }

  @Test
  public void testSafeOperation() {
    testExample("Examples/SafeCallsAndElvis/SafeOperation.kt", SafeOperationKt::main);
  }

  @Test
  public void testAlso() {
    testExample("Examples/ScopeFunctions/Also.kt", scopefunctions.AlsoKt::main);
  }

  @Test
  public void testApplyIfNotNull() {
    testExample("Examples/ScopeFunctions/ApplyIfNotNull.kt", scopefunctions.ApplyIfNotNullKt::main);
  }

  @Test
  public void testApplyVsAlso() {
    testExample("Examples/ScopeFunctions/ApplyVsAlso.kt", scopefunctions.ApplyVsAlsoKt::main);
  }

  @Test
  public void testCheckArgument() {
    testExample("Examples/ScopeFunctions/CheckArgument.kt", scopefunctions.CheckArgumentKt::main);
  }

  @Test
  public void testNullableReceiver() {
    testExample("Examples/ScopeFunctions/NullableReceiver.kt", scopefunctions.NullableReceiverKt::main);
  }

  @Test
  public void testReadingName() {
    testExample("Examples/ScopeFunctions/ReadingName.kt", ReadingNameKt::main);
  }

  @Test
  public void testReadingNameWithIf() {
    testExample("Examples/ScopeFunctions/ReadingNameWithIf.kt", ReadingNameWithIfKt::main);
  }

  @Test
  public void testResultOfApply() {
    testExample("Examples/ScopeFunctions/ResultOfApply.kt", scopefunctions.ResultOfApplyKt::main);
  }

  @Test
  public void testResultOfWith() {
    testExample("Examples/ScopeFunctions/ResultOfWith.kt", scopefunctions.ResultOfWithKt::main);
  }

  @Test
  public void testSealedClasses() {
    testExample("Examples/SealedClasses/SealedClasses.kt", sealedclasses.SealedClassesKt::main);
  }

  @Test
  public void testSealedSubclasses() {
    testExample("Examples/SealedClasses/SealedSubclasses.kt", sealedclasses.SealedSubclassesKt::main);
  }

  @Test
  public void testSealedVsAbstract() {
    testExample("Examples/SealedClasses/SealedVsAbstract.kt", sealedclasses.SealedVsAbstractKt::main);
  }

  @Test
  public void testUnSealed() {
    testExample("Examples/SealedClasses/UnSealed.kt", withoutsealedclasses.UnSealedKt::main);
  }

  @Test
  public void testGardenItem() {
    testExample("Examples/SecondaryConstructors/GardenItem.kt", secondaryconstructors.GardenItemKt::main);
  }

  @Test
  public void testWithSecondary() {
    testExample("Examples/SecondaryConstructors/WithSecondary.kt", secondaryconstructors.WithSecondaryKt::main);
  }

  @Test
  public void testDefineTakeIf() {
    testExample("Examples/Sequences/DefineTakeIf.kt", definetakeif.DefineTakeIfKt::main);
  }

  @Test
  public void testEagerEvaluation() {
    testExample("Examples/Sequences/EagerEvaluation.kt", EagerEvaluationKt::main);
  }

  @Test
  public void testEagerVsLazyEvaluation() {
    testExample("Examples/Sequences/EagerVsLazyEvaluation.kt", creatingsequences.EagerVsLazyEvaluationKt::main);
  }

  @Test
  public void testInputLines1() {
    testExample("Examples/Sequences/InputLines1.kt", InputLines1Kt::main);
  }

  @Test
  public void testInputLines2() {
    testExample("Examples/Sequences/InputLines2.kt", InputLines2Kt::main);
  }

  @Test
  public void testNoComputationYet() {
    testExample("Examples/Sequences/NoComputationYet.kt", creatingsequences.NoComputationYetKt::main);
  }

  @Test
  public void testNumberSequence1() {
    testExample("Examples/Sequences/NumberSequence1.kt", NumberSequence1Kt::main);
  }

  @Test
  public void testNumberSequence2() {
    testExample("Examples/Sequences/NumberSequence2.kt", NumberSequence2Kt::main);
  }

  @Test
  public void testTerminalOperations() {
    testExample("Examples/Sequences/TerminalOperations.kt", creatingsequences.TerminalOperationsKt::main);
  }

  @Test
  public void testMutableSet() {
    testExample("Examples/Sets/MutableSet.kt", MutableSetKt::main);
  }

  @Test
  public void testRemoveDuplicates() {
    testExample("Examples/Sets/RemoveDuplicates.kt", RemoveDuplicatesKt::main);
  }

  @Test
  public void testSets() {
    testExample("Examples/Sets/Sets.kt", SetsKt::main);
  }

  @Test
  public void testExpressionInTemplate() {
    testExample("Examples/StringTemplates/ExpressionInTemplate.kt", ExpressionInTemplateKt::main);
  }

  @Test
  public void testStringConcatenation() {
    testExample("Examples/StringTemplates/StringConcatenation.kt", StringConcatenationKt::main);
  }

  @Test
  public void testStringTemplates() {
    testExample("Examples/StringTemplates/StringTemplates.kt", StringTemplatesKt::main);
  }

  @Test
  public void testTripleQuotes() {
    testExample("Examples/StringTemplates/TripleQuotes.kt", TripleQuotesKt::main);
  }

  @Test
  public void testBasicFunctions() {
    testExample("Examples/Summary1/BasicFunctions.kt", BasicFunctionsKt::main);
  }

  @Test
  public void testBooleans() {
    testExample("Examples/Summary1/Booleans.kt", BooleansKt::main);
  }

  @Test
  public void testDoWhile() {
    testExample("Examples/Summary1/DoWhile.kt", DoWhileKt::main);
  }

  @Test
  public void testHello() {
    testExample("Examples/Summary1/Hello.kt", HelloKt::main);
  }

  @Test
  public void testIfExpression() {
    testExample("Examples/Summary1/IfExpression.kt", IfExpressionKt::main);
  }

  @Test
  public void testIfResult() {
    testExample("Examples/Summary1/IfResult.kt", IfResultKt::main);
  }

  @Test
  public void testMembership() {
    testExample("Examples/Summary1/Membership.kt", MembershipKt::main);
  }

  @Test
  public void testNumberTypes() {
    testExample("Examples/Summary1/NumberTypes.kt", NumberTypesKt::main);
  }

  @Test
  public void testOverflow() {
    testExample("Examples/Summary1/Overflow.kt", OverflowKt::main);
  }

  @Test
  public void testRangeOfInt() {
    testExample("Examples/Summary1/RangeOfInt.kt", RangeOfIntKt::main);
  }

  @Test
  public void testStringIteration() {
    testExample("Examples/Summary1/StringIteration.kt", StringIterationKt::main);
  }

  @Test
  public void testStrTemplates() {
    testExample("Examples/Summary1/StrTemplates.kt", StrTemplatesKt::main);
  }

  @Test
  public void testThreeQuotes() {
    testExample("Examples/Summary1/ThreeQuotes.kt", ThreeQuotesKt::main);
  }

  @Test
  public void testTruncation() {
    testExample("Examples/Summary1/Truncation.kt", TruncationKt::main);
  }

  @Test
  public void testUnitReturn() {
    testExample("Examples/Summary1/UnitReturn.kt", UnitReturnKt::main);
  }

  @Test
  public void testWhile() {
    testExample("Examples/Summary1/While.kt", WhileKt::main);
  }

  @Test
  public void testArraySpread() {
    testExample("Examples/Summary2/ArraySpread.kt", ArraySpreadKt::main);
  }

  @Test
  public void testASCIIMap() {
    testExample("Examples/Summary2/ASCIIMap.kt", ASCIIMapKt::main);
  }

  @Test
  public void testAtomicTestCapture() {
    testExample("Examples/Summary2/AtomicTestCapture.kt", AtomicTestCaptureKt::main);
  }

  @Test
  public void testBoxes() {
    testExample("Examples/Summary2/Boxes.kt", BoxesKt::main);
  }

  @Test
  public void testClassBodies() {
    testExample("Examples/Summary2/ClassBodies.kt", ClassBodiesKt::main);
  }

  @Test
  public void testColorSet() {
    testExample("Examples/Summary2/ColorSet.kt", ColorSetKt::main);
  }

  @Test
  public void testExplicitTyping() {
    testExample("Examples/Summary2/ExplicitTyping.kt", ExplicitTypingKt::main);
  }

  @Test
  public void testGetterAndSetter() {
    testExample("Examples/Summary2/GetterAndSetter.kt", summary2.GetterAndSetterKt::main);
  }

  @Test
  public void testJetPack() {
    testExample("Examples/Summary2/JetPack.kt", JetPackKt::main);
  }

  @Test
  public void testListCollection() {
    testExample("Examples/Summary2/ListCollection.kt", ListCollectionKt::main);
  }

  @Test
  public void testListOfStrings() {
    testExample("Examples/Summary2/ListOfStrings.kt", ListOfStringsKt::main);
  }

  @Test
  public void testMultipleListReferences() {
    testExample("Examples/Summary2/MultipleListReferences.kt", MultipleListReferencesKt::main);
  }

  @Test
  public void testPropertyReadWrite() {
    testExample("Examples/Summary2/PropertyReadWrite.kt", summary2.PropertyReadWriteKt::main);
  }

  @Test
  public void testQuadratic() {
    testExample("Examples/Summary2/Quadratic.kt", QuadraticKt::main);
  }

  @Test
  public void testReadonlyVsMutableList() {
    testExample("Examples/Summary2/ReadonlyVsMutableList.kt", ReadonlyVsMutableListKt::main);
  }

  @Test
  public void testTemperature() {
    testExample("Examples/Summary2/Temperature.kt", TemperatureKt::main);
  }

  @Test
  public void testTicTacToe() {
    testExample("Examples/Summary2/TicTacToe.kt", TicTacToeKt::main);
  }

  @Test
  public void testToDoubleException() {
    testExample("Examples/Summary2/ToDoubleException.kt", ToDoubleExceptionKt::main);
  }

  @Test
  public void testUseALibrary() {
    testExample("Examples/Summary2/UseALibrary.kt", UseALibraryKt::main);
  }

  @Test
  public void testUsingAtomicTest() {
    testExample("Examples/Summary2/UsingAtomicTest.kt", UsingAtomicTestKt::main);
  }

  @Test
  public void testVarArgs() {
    testExample("Examples/Summary2/VarArgs.kt", VarArgsKt::main);
  }

  @Test
  public void testWildAnimals() {
    testExample("Examples/Summary2/WildAnimals.kt", WildAnimalsKt::main);
  }

  @Test
  public void testTDDFail() {
    testExample("Examples/Testing/TDDFail.kt", testing1.TDDFailKt::main);
  }

  @Test
  public void testTDDStillFails() {
    testExample("Examples/Testing/TDDStillFails.kt", testing2.TDDStillFailsKt::main);
  }

  @Test
  public void testTDDWorks() {
    testExample("Examples/Testing/TDDWorks.kt", testing3.TDDWorksKt::main);
  }

  @Test
  public void testTestingExample() {
    testExample("Examples/Testing/TestingExample.kt", TestingExampleKt::main);
  }

  @Test
  public void testTrace1() {
    testExample("Examples/Testing/Trace1.kt", Trace1Kt::main);
  }

  @Test
  public void testBeverageContainer() {
    testExample("Examples/TypeChecking/BeverageContainer.kt", typechecking.BeverageContainerKt::main);
  }

  @Test
  public void testBeverageContainer2() {
    testExample("Examples/TypeChecking/BeverageContainer2.kt", typechecking2.BeverageContainer2Kt::main);
  }

  @Test
  public void testBeverageContainer3() {
    testExample("Examples/TypeChecking/BeverageContainer3.kt", typechecking3.BeverageContainer3Kt::main);
  }

  @Test
  public void testInsects() {
    testExample("Examples/TypeChecking/Insects.kt", typechecking.InsectsKt::main);
  }

  @Test
  public void testTypeCheck1() {
    testExample("Examples/TypeChecking/TypeCheck1.kt", typechecking.TypeCheck1Kt::main);
  }

  @Test
  public void testTypeCheck2() {
    testExample("Examples/TypeChecking/TypeCheck2.kt", typechecking.TypeCheck2Kt::main);
  }

  @Test
  public void testTypeCheck3() {
    testExample("Examples/TypeChecking/TypeCheck3.kt", typechecking3.TypeCheck3Kt::main);
  }

  @Test
  public void testTypeCheckingSoln1() {
    testExample("Examples/TypeChecking/TypeCheckingSoln1.kt", typecheckingsoln1.TypeCheckingSoln1Kt::main);
  }

  @Test
  public void testTypeCheckingSoln2a() {
    testExample("Examples/TypeChecking/TypeCheckingSoln2a.kt", typecheckingsoln2a.TypeCheckingSoln2aKt::main);
  }

  @Test
  public void testTypeCheckingSoln2b() {
    testExample("Examples/TypeChecking/TypeCheckingSoln2b.kt", typecheckingsoln2b.TypeCheckingSoln2bKt::main);
  }

  @Test
  public void testTypeCheckingSoln3() {
    testExample("Examples/TypeChecking/TypeCheckingSoln3.kt", typecheckingsoln3.TypeCheckingSoln3Kt::main);
  }

  @Test
  public void testNoFramework() {
    testExample("Examples/UnitTesting/NoFramework.kt", unittesting.NoFrameworkKt::main);
  }

  @Test
  public void testUsingExpect() {
    testExample("Examples/UnitTesting/UsingExpect.kt", unittesting.UsingExpectKt::main);
  }

  @Test
  public void testAssignment() {
    testExample("Examples/Upcasting/Assignment.kt", upcasting.AssignmentKt::main);
  }

  @Test
  public void testDrawing() {
    testExample("Examples/Upcasting/Drawing.kt", upcasting.DrawingKt::main);
  }

  @Test
  public void testTrimmedMembers() {
    testExample("Examples/Upcasting/TrimmedMembers.kt", upcasting.TrimmedMembersKt::main);
  }

  @Test
  public void testCompareTo() {
    testExample("Examples/UsingOperators/CompareTo.kt", usingoperators.CompareToKt::main);
  }

  @Test
  public void testDestructuringData() {
    testExample("Examples/UsingOperators/DestructuringData.kt", usingoperators.DestructuringDataKt::main);
  }

  @Test
  public void testDestructuringDuo() {
    testExample("Examples/UsingOperators/DestructuringDuo.kt", DestructuringDuoKt::main);
  }

  @Test
  public void testDestructuringMap() {
    testExample("Examples/UsingOperators/DestructuringMap.kt", usingoperators.DestructuringMapKt::main);
  }

  @Test
  public void testNewAngle() {
    testExample("Examples/UsingOperators/NewAngle.kt", NewAngleKt::main);
  }

  @Test
  public void testOperatorPlus() {
    testExample("Examples/UsingOperators/OperatorPlus.kt", OperatorPlusKt::main);
  }

  @Test
  public void testReadOnlyAndPlus() {
    testExample("Examples/UsingOperators/ReadOnlyAndPlus.kt", ReadOnlyAndPlusKt::main);
  }

  @Test
  public void testUnexpected() {
    testExample("Examples/UsingOperators/Unexpected.kt", UnexpectedKt::main);
  }

  @Test
  public void testUsingOperatorsSoln1() {
    testExample("Examples/UsingOperators/UsingOperatorsSoln1.kt", usingoperatorssoln1.UsingOperatorsSoln1Kt::main);
  }

  @Test
  public void testUsingOperatorsSoln2() {
    testExample("Examples/UsingOperators/UsingOperatorsSoln2.kt", usingoperatorssoln2.UsingOperatorsSoln2Kt::main);
  }

  @Test
  public void testUsingOperatorsSoln3() {
    testExample("Examples/UsingOperators/UsingOperatorsSoln3.kt", usingoperatorssoln3.UsingOperatorsSoln3Kt::main);
  }

  @Test
  public void testAVarIsMutable() {
    testExample("Examples/VarAndVal/AVarIsMutable.kt", AVarIsMutableKt::main);
  }

  @Test
  public void testVals() {
    testExample("Examples/VarAndVal/Vals.kt", ValsKt::main);
  }

  @Test
  public void testVars() {
    testExample("Examples/VarAndVal/Vars.kt", VarsKt::main);
  }

  @Test
  public void testListOf() {
    testExample("Examples/Varargs/ListOf.kt", ListOfKt::main);
  }

  @Test
  public void testMainArgConversion() {
    testExample("Examples/Varargs/MainArgConversion.kt", MainArgConversionKt::main);
  }

  @Test
  public void testMainArgs() {
    testExample("Examples/Varargs/MainArgs.kt", MainArgsKt::main);
  }

  @Test
  public void testSpreadOperator() {
    testExample("Examples/Varargs/SpreadOperator.kt", SpreadOperatorKt::main);
  }

  @Test
  public void testTwoFunctionsWithVarargs() {
    testExample("Examples/Varargs/TwoFunctionsWithVarargs.kt", TwoFunctionsWithVarargsKt::main);
  }

  @Test
  public void testVarargLikeList() {
    testExample("Examples/Varargs/VarargLikeList.kt", VarargLikeListKt::main);
  }

  @Test
  public void testVarargSum() {
    testExample("Examples/Varargs/VarargSum.kt", VarargSumKt::main);
  }

  @Test
  public void testVariableArgList() {
    testExample("Examples/Varargs/VariableArgList.kt", VariableArgListKt::main);
  }

  @Test
  public void testCookie() {
    testExample("Examples/Visibility/Cookie.kt", CookieKt::main);
  }

  @Test
  public void testMultipleRef() {
    testExample("Examples/Visibility/MultipleRef.kt", MultipleRefKt::main);
  }

  @Test
  public void testObserveAnimals() {
    testExample("Examples/Visibility/ObserveAnimals.kt", ObserveAnimalsKt::main);
  }

  @Test
  public void testAnalyzeInput() {
    testExample("Examples/WhenExpressions/AnalyzeInput.kt", AnalyzeInputKt::main);
  }

  @Test
  public void testBmiWhen() {
    testExample("Examples/WhenExpressions/BmiWhen.kt", BmiWhenKt::main);
  }

  @Test
  public void testGermanOrdinals() {
    testExample("Examples/WhenExpressions/GermanOrdinals.kt", GermanOrdinalsKt::main);
  }

  @Test
  public void testMatchingAgainstVals() {
    testExample("Examples/WhenExpressions/MatchingAgainstVals.kt", MatchingAgainstValsKt::main);
  }

  @Test
  public void testMixColors() {
    testExample("Examples/WhenExpressions/MixColors.kt", MixColorsKt::main);
  }

  @Test
  public void testRepetitive() {
    testExample("Examples/WithFunction/Repetitive.kt", withfunction.RepetitiveKt::main);
  }

  @Test
  public void testStateMachineSoln1() {
    testExample("Examples/WithFunction/StateMachineSoln1.kt", statemachinesoln1.StateMachineSoln1Kt::main);
  }

  @Test
  public void testUsingWith() {
    testExample("Examples/WithFunction/UsingWith.kt", withfunction.UsingWithKt::main);
  }

  @Test
  public void testWithCleanup() {
    testExample("Examples/WithFunction/WithCleanup.kt", withfunction.WithCleanupKt::main);
  }

  @Test
  public void testLearnerTest() {
    testJUnitClass(unittesting.LearnerTest.class);
  }

  @Test
  public void testSampleTest() {
    testJUnitClass(unittesting.SampleTest.class);
  }

  @Test
  public void testStateMachineTest() {
    testJUnitClass(unittesting.StateMachineTest.class);
  }
}
