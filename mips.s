.data
	newline:	.asciiz	"\n"

.text

main:

addi $sp, $sp, 0
li $s6, 0
addi $t0,$s6,0
addi $t1,$t0,0
addi $sp, $sp, 20
sw $ra, -16($sp)
sw $a0, -12($sp)
sw $t0, -8($sp)
sw $t1, -4($sp)
sw $v0, 0($sp)
li $a0, 4
sll $a0, $a0, 2
li $v0, 9
syscall
lw $t0, -8($sp)
lw $t1, -4($sp)
lw $a0, -12($sp)
move $t2, $v0
lw $v0, 0($sp)
lw $ra, -16($sp)
addi $sp, $sp, -20
addi $t3,$t2,0
sw $t1, 4($sp)
sw $t0, 8($sp)
sw $t3, 12($sp)
sw $t2, 16($sp)
addi $sp, $sp, 20
li $s6, 5
addi $t4,$s6,0
addi $t1,$t4,0
label0_scope3:
lw $t0 -16($sp)
addi $t1,$t0,0
li $s6, 3
addi $t2,$s6,0
sub $t3, $t1, $t2
blez $t3, _L0
add $t3, $zero, $zero
j _L1
_L0:
addi $t3, $zero, 1
_L1:
sw $t0, -16($sp)
sw $t3, 0($sp)
sw $t2, 12($sp)
sw $t1, 8($sp)
beq $t3, $zero, label1_scope3
lw $t0 -16($sp)
addi $t1,$t0,0
li $s6, 10
addi $t2,$s6,0
add $t3,$t1,$t2
li $s6, 0
addi $t4,$s6,0
addi $t5,$t0,0
li $s7, 4
mult $s7,$t5
mflo $t6
add $t4,$t4,$t6
li $s6, 4
li $s7, 1
sub $t7, $s6, $s7
mult $t7,$t5
mflo $t7
sub $t4,$t4,$t7
lw $t8 -8($sp)
sll $t4,$t4, 2
addi $t4, $t4, 4
add $t4,$sp,$t4
sw $t3, -8($t4)
li $s6, 0
addi $t9,$s6,0
addi $s0,$t0,0
li $s7, 4
mult $s7,$s0
mflo $s1
add $t9,$t9,$s1
li $s6, 4
li $s7, 1
sub $s2, $s6, $s7
mult $s2,$s0
mflo $s2
sub $t9,$t9,$s2
sll $t9,$t9, 2
addi $t9, $t9, 4
add $t9,$sp,$t9
lw $s3, -8($t9)
addi $sp, $sp, 12
sw $a0, -8($sp)
sw $v0, -4($sp)
sw $v1, -0($sp)
li $v0, 1
move $a0, $s3
syscall
li $v0, 4
la $a0, newline
syscall
lw $v0, -4($sp)
lw $v1, -0($sp)
lw $a0, -8($sp)
addi $sp, $sp, -12
addi $s4,$t0,0
li $s6, 1
addi $s5,$s6,0
sw $t1 36($sp)
add $t1,$s4,$s5
addi $t0,$t1,0
sw $s0, 64($sp)
sw $t2, 40($sp)
sw $s3, 60($sp)
sw $t1, 36($sp)
sw $t3, 32($sp)
sw $t5, 28($sp)
sw $t1, 16($sp)
sw $s5, 24($sp)
sw $s2, 76($sp)
sw $t8, -8($sp)
sw $t7, 52($sp)
sw $s4, 20($sp)
sw $t0, -16($sp)
sw $s1, 72($sp)
sw $t6, 48($sp)
sw $t9, 68($sp)
sw $t4, 44($sp)
j label0_scope3
label1_scope3:
addi $sp, $sp, -20
li $v0, 10 
syscall
addi $sp, $sp, 20
foo_00CLASS1:
li $s6, 105
addi $t0,$s6,0
addi $t1,$t0,0
addi $t2,$t1,0
addi $sp, $sp, 12
sw $a0, -8($sp)
sw $v0, -4($sp)
sw $v1, -0($sp)
li $v0, 1
move $a0, $t2
syscall
li $v0, 4
la $a0, newline
syscall
lw $v0, -4($sp)
lw $v1, -0($sp)
lw $a0, -8($sp)
addi $sp, $sp, -12
li $s6, 0
addi $t3,$s6,0
move $v0, $t3
jr $ra
addi $sp, $sp, -20
addi $sp, $sp, 0
