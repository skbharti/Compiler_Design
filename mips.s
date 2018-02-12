.text

a: .word
b: .word
c: .word
ar: .space 8


main:

li $s6, 2
addi null,$s6,0
li $s6, 7
addi null,$s6,0
add null,null,null
sub null, null, 50
blez null, $zero,@L0:

add null, $zero, $zero
j @L1:

@L0:

addi null, $zero, 1
@L1:

addi $sp, $sp, -20
sw $ra, 16($sp)
sw $a0, 12($sp)
sw $t0, 8($sp)
sw $t1, 4($sp)
sw $v0, 0($sp)
li $a0, 2
sll $a0, $a0, 2
jal _new_array
lw $t0, 8($sp)
lw $t1, 4($sp)
lw $a0, 12($sp)
move null, $v0
lw $v0, 0($sp)
lw $ra, 16($sp)
addi $sp, $sp, 20
beq null, $zero, null
bne null, $zero, null
bltz null, $zero, null
blez null, $zero, null
bgtz null, $zero, null
bgez null, $zero, null
bne null, $zero, null
beq null, $zero, null
sw $t2, ar
sw $t1, b
sw $t0, c
sw $t0 c
sw $t1 b
sw $t2 ar
addi $sp, $sp, -12
sw $ra, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
jal null
move null, $v0
lw $v0, 4($sp)
lw $v1, 0($sp)
lw $ra, 8($sp)
addi $sp, $sp, 12
mov $v0, null
jr $ra
mov $v0, null
jr $ra
sw $t0, a
sw $t0 a
