class Solution:
    def squareIsWhite(self, coordinates: str) -> bool:
        black=['a','c','e','g']
        white=['b','d','f','h']
        if coordinates[0] in black:
            if int(coordinates[1])%2==0:
                return True
            return False
        if coordinates[0] in white:
            if int(coordinates[1])%2!=0:
                return True
            return False