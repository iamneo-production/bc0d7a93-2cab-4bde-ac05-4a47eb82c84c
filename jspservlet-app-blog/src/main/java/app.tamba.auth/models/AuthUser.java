import java.util.Set;

@Entity

@Table (name = "AuthUser")

@Data

@NoArgsConstructor @ALLArgsConstructor

@JsonInclude(JsonInclude. Include.NON NULL)

@Proxy Lazy = false)

@JsonIgnoreProperties({ "hibernateLazy Initializer", "handler"}) public class AuthUser implements Serializable {

@Id

@Column (unique = true, nullable = false) @GeneratedValue(strategy = GenerationType.AUTO) private Long id;

@Column (nullable = false, unique = true)

@Naturalid

private String phoneNumber;

private String email;

@Column (nullable = false)

private String fullName;

@Column(nullable = false)
@Enumerated (EnumType.STRING)
}