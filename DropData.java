package net.sf.l2j.gameserver.model.item;

/**
 * A container used by monster drops.<br>
 * <br>
 * The chance is exprimed as 1.000.000 to handle 4 point accuracy digits (100.0000%).
 */
public class DropData
{
	public static final int MAX_CHANCE = 1000000;
	
	private final int _itemId;
	private final int _minDrop;
	private final int _minDropRB;
	private final int _maxDrop;
	private final int _maxDropRB;
	private final int _chance;

	
	public DropData(int itemId, int minDrop, int maxDrop, int chance)
	{
		_itemId = itemId;			
		_minDropRB = minDrop;
		_maxDropRB = maxDrop;
		_chance = chance;
		
		//Setting MAX and MIN drop of spellbooks to 0 by ID check
		
		if ((_itemId == 1047) || (_itemId == 1048) || (_itemId == 1049) || (_itemId == 1050) || (_itemId == 1051)
			 || (_itemId == 1052) || (_itemId == 1053) || (_itemId == 1054) || (_itemId == 1055) || (_itemId == 1056)
			 || (_itemId == 1057) || (_itemId == 1058) || (_itemId == 1059) || (_itemId == 1095) || (_itemId == 1096)
			 || (_itemId == 1097) || (_itemId == 1098) || (_itemId == 1099) || (_itemId == 1395) || (_itemId == 1396)
			 || (_itemId == 1397) || (_itemId == 1400) || (_itemId == 1402) || (_itemId == 1403) || (_itemId == 1407)
			 || (_itemId == 1408) || (_itemId == 1409) || (_itemId == 1410) || (_itemId == 1413) || (_itemId == 1416)
			 || (_itemId == 1417) || (_itemId == 1517) || (_itemId == 1670) || (_itemId == 1671) || (_itemId == 3039)
			 || (_itemId == 3040) || (_itemId == 3041) || (_itemId == 3042) || (_itemId == 3043) || (_itemId == 3044)
			 || (_itemId == 3045) || (_itemId == 3046) || (_itemId == 3047) || (_itemId == 3048) || (_itemId == 3049)
			 || (_itemId == 3050) || (_itemId == 3051) || (_itemId == 3052) || (_itemId == 3053) || (_itemId == 3054)
			 || (_itemId == 3055) || (_itemId == 3056) || (_itemId == 3057) || (_itemId == 3058) || (_itemId == 3059)
			 || (_itemId == 3060) || (_itemId == 3061) || (_itemId == 3062) || (_itemId == 3063) || (_itemId == 3064)
			 || (_itemId == 3065) || (_itemId == 3066) || (_itemId == 3067) || (_itemId == 3068) || (_itemId == 3069)
			 || (_itemId == 3070) || (_itemId == 3071) || (_itemId == 3072) || (_itemId == 3073) || (_itemId == 3074)
			 || (_itemId == 3075) || (_itemId == 3076) || (_itemId == 3077) || (_itemId == 3078) || (_itemId == 3079)
			 || (_itemId == 3080) || (_itemId == 3079) || (_itemId == 3080) || (_itemId == 3081) || (_itemId == 3082)
			 || (_itemId == 3083) || (_itemId == 3084) || (_itemId == 3085) || (_itemId == 3086) || (_itemId == 3087)
			 || (_itemId == 3088) || (_itemId == 3089) || (_itemId == 3090) || (_itemId == 3091) || (_itemId == 3092)
			 || (_itemId == 3093) || (_itemId == 3094) || (_itemId == 3095) || (_itemId == 3096) || (_itemId == 3097)
			 || (_itemId == 3098) || (_itemId == 3100) || (_itemId == 3101) || (_itemId == 3102) || (_itemId == 3429)
			 || (_itemId == 3430) || (_itemId == 3431) || (_itemId == 3432) || (_itemId == 3941) || (_itemId == 3942)
			 || (_itemId == 3944) || (_itemId == 4200) || (_itemId == 4201) || (_itemId == 4203) || (_itemId == 4206)
			 || (_itemId == 4207) || (_itemId == 4906) || (_itemId == 4907) || (_itemId == 4908) || (_itemId == 4909)
			 || (_itemId == 4910) || (_itemId == 4911) || (_itemId == 4912) || (_itemId == 4913) || (_itemId == 4914)
			 || (_itemId == 4916) || (_itemId == 4917) || (_itemId == 4918) || (_itemId == 4919) || (_itemId == 4920)
			 || (_itemId == 4922) || (_itemId == 4923) || (_itemId == 4924) || (_itemId == 4928) || (_itemId == 4929)
			 || (_itemId == 4930) || (_itemId == 4931) || (_itemId == 4932) || (_itemId == 4933) || (_itemId == 4934)
			 || (_itemId == 4935) || (_itemId == 5013) || (_itemId == 5014) || (_itemId == 5015) || (_itemId == 5809)
			 || (_itemId == 5810) || (_itemId == 5811) || (_itemId == 5812) || (_itemId == 5813) || (_itemId == 5814)
			 || (_itemId == 5815) || (_itemId == 5816) || (_itemId == 5916) || (_itemId == 5917) || (_itemId == 5918)
			 || (_itemId == 5919) || (_itemId == 5920) || (_itemId == 6352) || (_itemId == 6398) || (_itemId == 7638)
			 || (_itemId == 7639) || (_itemId == 7640) || (_itemId == 7641) || (_itemId == 7642) || (_itemId == 7643)
			 || (_itemId == 7644) || (_itemId == 7645) || (_itemId == 7646) || (_itemId == 7647) || (_itemId == 7648)
			 || (_itemId == 7649) || (_itemId == 7650) || (_itemId == 7651) || (_itemId == 7652) || (_itemId == 7653)
			 || (_itemId == 7654) || (_itemId == 7655) || (_itemId == 7657) || (_itemId == 7658) || (_itemId == 7659)
			 || (_itemId == 7660) || (_itemId == 7661) || (_itemId == 7662) || (_itemId == 7663) || (_itemId == 7664)
			 || (_itemId == 7666) || (_itemId == 7667) || (_itemId == 7668) || (_itemId == 7669) || (_itemId == 7670)
			 || (_itemId == 7671) || (_itemId == 8400) || (_itemId == 8401) || (_itemId == 8402) || (_itemId == 8616)
			 || (_itemId == 8617) || (_itemId == 8877) || (_itemId == 8878) || (_itemId == 8879) || (_itemId == 8880)
			 || (_itemId == 8881) || (_itemId == 8882) || (_itemId == 8883) || (_itemId == 8884) || (_itemId == 8890)
			 || (_itemId == 8891) || (_itemId == 8899) || (_itemId == 8900) || (_itemId == 8901) || (_itemId == 8902)
			 || (_itemId == 8903) || (_itemId == 8904) || (_itemId == 8905) || (_itemId == 8906) || (_itemId == 8907)
			 || (_itemId == 8908) || (_itemId == 8945) || (_itemId == 8946) || (_itemId == 8380) || (_itemId == 8381)
			 || (_itemId == 8382) || (_itemId == 8383) || (_itemId == 8384) || (_itemId == 8385) || (_itemId == 8386)
			 || (_itemId == 8387) || (_itemId == 8388) || (_itemId == 8389) || (_itemId == 8392) || (_itemId == 8393)
			 || (_itemId == 8394) || (_itemId == 8395) || (_itemId == 8396) || (_itemId == 8397) || (_itemId == 8398)
			 || (_itemId == 8399) || (_itemId == 7665))
				{
				_maxDrop = 0;
				_minDrop=0;
				}
		// 1.Checking if chance is bigger than 20% of MAX_CHANCE (To do not apply mix/max change for weapons/armors drop)
		// 2. Checking if is chance bigger than 100%
		// 3. Checking if its not adena / sealstone
		else if ((chance * 12 > (200000)) && (Math.round((chance * 12)/ MAX_CHANCE) > 1) && (_itemId != 57) && (_itemId != 6360) && (_itemId != 6361) && (_itemId != 6362) ) 
		{	
				_maxDrop = (maxDrop * 3 * (Math.round(chance/MAX_CHANCE)));
				_minDrop = minDrop * 1;
		}
		else if ((chance * 12 > 200000)  && (_itemId != 57) && (_itemId != 6360) && (_itemId != 6361) && (_itemId != 6362) ){
				_maxDrop = maxDrop*3;
				_minDrop = minDrop;
			}
		else {
				_maxDrop = maxDrop;
				_minDrop = minDrop; 
			}
		
		

	}
	
	@Override
	public String toString()
	{
		return "DropData =[ItemID: " + _itemId + " Min: " + _minDrop + " Max: " + _maxDrop + " Chance: " + (_chance / 10000.0) + "%]";
	}
	
	/**
	 * @return the id of the dropped item.
	 */
	public int getItemId()
	{
		return _itemId;
	}
	
	/**
	 * @return the minimum quantity of dropped items.
	 */
	public int getMinDrop()
	{
		return _minDrop;
	}
	
	/**
	 * @return the minimum quantity of dropped items.
	 */
	public int getMinDropRB()
	{
		return _minDropRB;
	}
	
	/**
	 * @return the maximum quantity of dropped items.
	 */
	public int getMaxDrop()
	{

		return _maxDrop;
	}
	/**
	 * @return the maximum quantity of dropped items RB.
	 */
	public int getMaxDropRB()
	{

		return _maxDropRB;
	}
	
	/**
	 * @return the chance to have a drop, under a 1.000.000 chance.
	 */
	public int getChance()
	{
		return _chance;
	}
}