package ADSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_RiderStatus extends EnumerationDescriptorBase {

  public EnumerationDescriptor_RiderStatus() {
    super(0x5c9a0e652f1e4e9aL, 0xadf18dcc826f515fL, 0x4ed7adb2eb5617baL, "RiderStatus", "r:f31c5c66-7689-442d-abb8-ca332c02cb22(ADSL.structure)/5681200438915241914");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_AVAILABLE_0 = new EnumerationDescriptor.MemberDescriptor("AVAILABLE", "AVAILABLE", 0x4ed7adb2eb5617bbL, "r:f31c5c66-7689-442d-abb8-ca332c02cb22(ADSL.structure)/5681200438915241915");
  private final EnumerationDescriptor.MemberDescriptor myMember_BUSY_0 = new EnumerationDescriptor.MemberDescriptor("BUSY", "BUSY", 0x4ed7adb2eb5617bcL, "r:f31c5c66-7689-442d-abb8-ca332c02cb22(ADSL.structure)/5681200438915241916");
  private final EnumerationDescriptor.MemberDescriptor myMember_UNAVAIBLE_0 = new EnumerationDescriptor.MemberDescriptor("UNAVAIBLE", "UNAVAIBLE", 0x4ed7adb2eb5617bfL, "r:f31c5c66-7689-442d-abb8-ca332c02cb22(ADSL.structure)/5681200438915241919");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x5c9a0e652f1e4e9aL, 0xadf18dcc826f515fL, 0x4ed7adb2eb5617baL, 0x4ed7adb2eb5617bbL, 0x4ed7adb2eb5617bcL, 0x4ed7adb2eb5617bfL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_AVAILABLE_0, myMember_BUSY_0, myMember_UNAVAIBLE_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "AVAILABLE":
        return myMember_AVAILABLE_0;
      case "BUSY":
        return myMember_BUSY_0;
      case "UNAVAIBLE":
        return myMember_UNAVAIBLE_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}